package eu.comsode.libraries.jckan;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;

import eu.comsode.libraries.jckan.dao.DatasetDAO;
import eu.comsode.libraries.jckan.dao.ResourceDAO;

public class CkanRepository implements AutoCloseable {
    private Client client;

    private ResourceDAO resourceDAO;

    private DatasetDAO datasetDAO;

    public CkanRepository(String ckanUri, String apiKey) {
        client = ClientBuilder.newBuilder()
                .register(MultiPartFeature.class)
                .register(JacksonFeature.class)
                .build();
        resourceDAO = new ResourceDAO(client, ckanUri, apiKey, this);
        datasetDAO = new DatasetDAO(client, ckanUri, apiKey);
    }

    public ResourceDAO getResourceDAO() {
        return resourceDAO;
    }

    public DatasetDAO getDatasetDAO() {
        return datasetDAO;
    }

    @Override
    public void close() {
        client.close();
    }
}
