package eu.comsode.libraries.jckan;

import java.io.File;
import java.io.FileNotFoundException;

import eu.comsode.libraries.jckan.model.FileUpload;
import eu.comsode.libraries.jckan.model.Resource;

public class ResourceTest {
//    @Test
    public void test2() throws CkanException, FileNotFoundException {
        CkanRepository ckanRepository = new CkanRepository("http://localhost:5000/api/3/action/", "c0b9f02a-6aff-4329-83c3-6686e14b4b5d");
        Resource resource1 = new Resource();
        resource1.setUrl("http://google.com");
        resource1.setName("bububu");
//        Resource resource = ckanRepository.getResourceDAO().read("2337edaf-56ca-40f1-bbce-59518dd88ce4");
        Resource resource = ckanRepository.getResourceDAO().create("1stdataset", resource1, new FileUpload(new File("/home/michal/Pictures/aaa.png")));
//        ckanRepository.getResourceDAO().delete(resource.getId());
        System.out.println(resource.toString());
    }
}
