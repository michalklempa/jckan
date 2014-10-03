package eu.comsode.libraries.jckan;

import java.io.File;
import java.io.FileNotFoundException;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

import org.junit.Test;

import eu.comsode.libraries.jckan.model.FileUpload;
import eu.comsode.libraries.jckan.model.Resource;

public class ResourceTest {
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

    @Test
    public void test2() throws CkanException, FileNotFoundException {
        CkanRepository ckanRepository = new CkanRepository("http://localhost:5000/api/3/action/", "c0b9f02a-6aff-4329-83c3-6686e14b4b5d");
        Resource resource1 = new Resource();
        resource1.setUrl("http://google.com");
        resource1.setName("dsaffdsa");
//        Resource resource = ckanRepository.getResourceDAO().read("2337edaf-56ca-40f1-bbce-59518dd88ce4");
        Resource resource = ckanRepository.getResourceDAO().create("1stdataset", resource1, new FileUpload(new File("/home/michal/Pictures/aaa.png")));
        ckanRepository.getResourceDAO().delete(resource.getId());
        System.out.println(resource.toString());
    }
}
