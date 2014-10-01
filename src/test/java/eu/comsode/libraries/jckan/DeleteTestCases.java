package eu.comsode.libraries.jckan;


import org.junit.* ;

import static org.junit.Assert.* ;

import com.google.gson.Gson;

import eu.comsode.libraries.jckan.*;

import java.util.UUID;

public class DeleteTestCases {

    private static String ApiKey;
    static {
        ApiKey = System.getenv("APIKEY");
        if ( ApiKey == null ) {
            throw new RuntimeException("Unable to find APIKEY env variable");
        }
    }

    @Test
    public void test_DeleteDataset() {
        Clientsss c = new Clientsss( new Connection("http://localhost", 5000),
                              DeleteTestCases.ApiKey);
        try {
            Dataset ds = new Dataset();
            ds.setName( UUID.randomUUID().toString() );
            ds.setTitle("Test Dataset");
            ds.setNotes("A description");
            Dataset result = c.createDataset(ds);

            c.deleteDataset(result.getId());
        } catch ( CKANException e ) {
            System.out.println(e);
        }
    }

    @Test
    public void test_DeleteDatasetNoAuth() {
        Clientsss c = new Clientsss( new Connection("http://localhost", 5000),
                              "invalid");
        try {
            Dataset ds = new Dataset();
            ds.setName( UUID.randomUUID().toString() );
            ds.setTitle("Test Dataset");
            ds.setNotes("A description");
            Dataset result = c.createDataset(ds);

            c.deleteDataset(result.getId());
            assertTrue( false );
        } catch ( CKANException e ) {
            assertEquals(2, e.getErrorMessages().size());
        }
    }


}


