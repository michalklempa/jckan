package eu.comsode.libraries.jckan;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

import org.junit.Test;

public class HeaderTest {
    @Test
    public void test1() {
        javax.ws.rs.client.Client client = ClientBuilder.newClient();
        WebTarget target = client.target("http://localhost:9998").path("resource");

        Form form = new Form();
        form.param("x", "foo");
        form.param("y", "bar");

        Extra bean =
                target.request(MediaType.APPLICATION_JSON_TYPE).header("X-CKAN-API-Key", "brekeke")
                .post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE),
                        Extra.class);
    }
}
