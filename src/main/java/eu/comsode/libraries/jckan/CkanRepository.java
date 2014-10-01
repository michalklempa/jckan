package eu.comsode.libraries.jckan;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import eu.comsode.libraries.jckan.dao.ResourceDAO;

public class CkanRepository {
    private String apiKey;

    private String ckanUri;

    private Client client;

    private ResourceDAO resourceDAO;

    public CkanRepository() {

    }

    public void initialize() {
        client = ClientBuilder.newClient();
        resourceDAO = new ResourceDAO();
        resourceDAO.setCkanUri(ckanUri);
        resourceDAO.setApiKey(apiKey);
        resourceDAO.setClient(client);
    }

    public ResourceDAO getResourceDAO() {
        return resourceDAO;
    }
}
