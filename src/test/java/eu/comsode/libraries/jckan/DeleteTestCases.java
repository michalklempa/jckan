package eu.comsode.libraries.jckan;

public class DeleteTestCases {

//    private static String ApiKey;
//    static {
//        ApiKey = System.getenv("APIKEY");
//        if ( ApiKey == null ) {
//            throw new RuntimeException("Unable to find APIKEY env variable");
//        }
//    }
//
//    @Test
//    public void test_DeleteDataset() {
//        Clientsss c = new Clientsss( new Connection("http://localhost", 5000),
//                              DeleteTestCases.ApiKey);
//        try {
//            Dataset ds = new Dataset();
//            ds.setName( UUID.randomUUID().toString() );
//            ds.setTitle("Test Dataset");
//            ds.setNotes("A description");
//            Dataset result = c.createDataset(ds);
//
//            c.deleteDataset(result.getId());
//        } catch ( CkanException e ) {
//            System.out.println(e);
//        }
//    }
//
//    @Test
//    public void test_DeleteDatasetNoAuth() {
//        Clientsss c = new Clientsss( new Connection("http://localhost", 5000),
//                              "invalid");
//        try {
//            Dataset ds = new Dataset();
//            ds.setName( UUID.randomUUID().toString() );
//            ds.setTitle("Test Dataset");
//            ds.setNotes("A description");
//            Dataset result = c.createDataset(ds);
//
//            c.deleteDataset(result.getId());
//            assertTrue( false );
//        } catch ( CkanException e ) {
//            assertEquals(2, e.getErrorMessages().size());
//        }
//    }

}
