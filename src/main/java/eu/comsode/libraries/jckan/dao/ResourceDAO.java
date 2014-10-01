package eu.comsode.libraries.jckan.dao;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

import eu.comsode.libraries.jckan.CKANException;
import eu.comsode.libraries.jckan.model.Resource;
import eu.comsode.libraries.jckan.model.Response;

public class ResourceDAO {
    private Client client;

    private String apiKey;

    private String ckanUri;

    public Resource read(String id) throws CKANException {
        WebTarget target = client.target(ckanUri).path("resource_show");

        Form form = new Form();
        form.param("id", id);

        Response<Resource> response = target
                .request(MediaType.APPLICATION_JSON_TYPE)
                .header("X-CKAN-API-Key", apiKey)
                .post(
                        Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE),
                        new GenericType<Response<Resource>>(Resource.class)
                );
        if (!response.isSuccess()) {
            throw new CKANException(response.getError().toString());
        }

        return response.getResult();
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getCkanUri() {
        return ckanUri;
    }

    public void setCkanUri(String ckanUri) {
        this.ckanUri = ckanUri;
    }

}
