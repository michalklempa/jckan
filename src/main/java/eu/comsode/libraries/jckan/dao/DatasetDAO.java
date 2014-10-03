package eu.comsode.libraries.jckan.dao;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import eu.comsode.libraries.jckan.CkanException;
import eu.comsode.libraries.jckan.model.Dataset;

public class DatasetDAO {
    private Client client;

    private String ckanUri;

    private String apiKey;

    public DatasetDAO(Client client, String ckanUri, String apiKey) {
        this.client = client;
        this.ckanUri = ckanUri;
        this.apiKey = apiKey;
    }

    public Dataset read(String id) throws CkanException {
        WebTarget target = client.target(ckanUri).path("package_show");

        Map<String, String> requestEntity = new HashMap<>();
        requestEntity.put("id", id);
        Dataset.Response response = target
                .request(MediaType.APPLICATION_JSON_TYPE)
                .header("X-CKAN-API-Key", apiKey)
                .<Dataset.Response> post(
                        Entity.entity(requestEntity, MediaType.APPLICATION_JSON_TYPE),
                        Dataset.Response.class);
        if (!response.isSuccess()) {
            throw new CkanException(response.getError().toString());
        }

        return response.getResult();
    }
}
