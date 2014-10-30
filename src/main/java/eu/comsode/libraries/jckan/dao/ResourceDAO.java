package eu.comsode.libraries.jckan.dao;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.media.multipart.FormDataMultiPart;
import org.glassfish.jersey.media.multipart.file.FileDataBodyPart;
import org.glassfish.jersey.media.multipart.file.StreamDataBodyPart;

import eu.comsode.libraries.jckan.CkanException;
import eu.comsode.libraries.jckan.CkanRepository;
import eu.comsode.libraries.jckan.model.Dataset;
import eu.comsode.libraries.jckan.model.FileUpload;
import eu.comsode.libraries.jckan.model.Resource;
import eu.comsode.libraries.jckan.model.StreamUpload;
import eu.comsode.libraries.jckan.model.Upload;
import eu.comsode.libraries.jckan.model.internal.StringResponse;

public class ResourceDAO {
    private Client client;

    private String ckanUri;

    private String apiKey;

    private CkanRepository parent;

    public ResourceDAO(Client client, String ckanUri, String apiKey, CkanRepository parent) {
        this.client = client;
        this.ckanUri = ckanUri;
        this.apiKey = apiKey;
        this.parent = parent;
    }

    public Resource create(String packageId, Resource resource, Upload upload) throws CkanException {
        WebTarget target = client.target(ckanUri).path("resource_create");

        resource.setPackage_id(packageId);

        Resource.Response response = target
                .request(MediaType.APPLICATION_JSON_TYPE)
                .header("X-CKAN-API-Key", apiKey)
                .<Resource.Response> post(
                        Entity.entity(resource, MediaType.APPLICATION_JSON_TYPE),
                        Resource.Response.class);
        if (!response.isSuccess()) {
            throw new CkanException(response.getError().toString());
        }
        if (upload != null) {
            return addUpload(response.getResult().getId(), upload);
        } else {
            return response.getResult();
        }
    }

    public Resource read(String id) throws CkanException {
        WebTarget target = client.target(ckanUri).path("resource_show");

        Map<String, String> requestEntity = new HashMap<>();
        requestEntity.put("id", id);
        Resource.Response response = target
                .request(MediaType.APPLICATION_JSON_TYPE)
                .header("X-CKAN-API-Key", apiKey)
                .<Resource.Response> post(
                        Entity.entity(requestEntity, MediaType.APPLICATION_JSON_TYPE),
                        Resource.Response.class);
        if (!response.isSuccess()) {
            throw new CkanException(response.getError().toString());
        }

        return response.getResult();
    }

    public Resource update(Resource resource, Upload upload) throws CkanException {
        WebTarget target = client.target(ckanUri).path("resource_update");

        Resource.Response response = target
                .request(MediaType.APPLICATION_JSON_TYPE)
                .header("X-CKAN-API-Key", apiKey)
                .<Resource.Response> post(
                        Entity.entity(resource, MediaType.APPLICATION_JSON_TYPE),
                        Resource.Response.class);
        if (!response.isSuccess()) {
            throw new CkanException(response.getError().toString());
        }
        if (upload != null) {
            return addUpload(response.getResult().getId(), upload);
        } else {
            return response.getResult();
        }
    }

    public void delete(String resourceId) throws CkanException {
        WebTarget target = client.target(ckanUri).path("resource_delete");

        Map<String, String> requestEntity = new HashMap<>();
        requestEntity.put("id", resourceId);
        StringResponse response = target
                .request(MediaType.APPLICATION_JSON_TYPE)
                .header("X-CKAN-API-Key", apiKey)
                .<StringResponse> post(
                        Entity.entity(requestEntity, MediaType.APPLICATION_JSON_TYPE),
                        StringResponse.class);
        if (!response.isSuccess()) {
            throw new CkanException(response.getError().toString());
        }
    }

    private Resource addUpload(String resourceId, Upload upload) throws CkanException {
        WebTarget target = client.target(ckanUri).path("resource_update");

        try (FormDataMultiPart multiPart = new FormDataMultiPart()) {
            multiPart.field("id", resourceId);
            if (upload instanceof FileUpload) {
                multiPart.bodyPart(new FileDataBodyPart("upload", ((FileUpload) upload).getFile()));
            } else if (upload instanceof StreamUpload) {
                multiPart.bodyPart(new StreamDataBodyPart("upload", ((StreamUpload) upload).getInputStream(), ((StreamUpload) upload).getFilename()));
            }

            Resource.Response response = target
                    .request(MediaType.APPLICATION_JSON_TYPE)
                    .header("X-CKAN-API-Key", apiKey)
                    .<Resource.Response> post(
                            Entity.entity(multiPart, multiPart.getMediaType()),
                            Resource.Response.class);
            if (!response.isSuccess()) {
                throw new CkanException(response.getError().toString());
            }
            return response.getResult();
        } catch (IOException ex) {
            throw new CkanException(ex);
        }
    }

    public List<Resource> list(String name) throws CkanException {
        Dataset dataset = parent.getDatasetDAO().read(name);

        return dataset.getResources();
    }
}
