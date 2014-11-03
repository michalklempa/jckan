package eu.comsode.libraries.jckan;

import java.io.FileNotFoundException;

import eu.comsode.libraries.jckan.model.Dataset;

public class DatasetTest {
//    @Test
    public void test2() throws CkanException, FileNotFoundException {
        CkanRepository ckanRepository = new CkanRepository("http://localhost:5000/api/3/action/", "c0b9f02a-6aff-4329-83c3-6686e14b4b5d");
//        Resource resource = ckanRepository.getResourceDAO().read("2337edaf-56ca-40f1-bbce-59518dd88ce4");
        Dataset dataset = ckanRepository.getDatasetDAO().read("1stdataset");
        System.out.println(dataset.toString());
    }
}
