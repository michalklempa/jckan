package eu.comsode.libraries.jckan;


public class GetTestCases {
//
//    private static String ApiKey;
//    static {
//        ApiKey = System.getenv("APIKEY");
//        if (ApiKey == null) {
//            throw new RuntimeException("Unable to find APIKEY env variable");
//        }
//    }
//
//    @Test
//    public void test_GetDataset() {
//        Clientsss c = new Clientsss(new Connection("http://localhost", 5000),
//                GetTestCases.ApiKey);
//        try {
//            Dataset ds = new Dataset();
//            ds.setName(UUID.randomUUID().toString());
//            ds.setTitle("Test Dataset");
//            ds.setNotes("A description");
//            c.createDataset(ds);
//
//            Dataset get = c.getDataset(ds.getName());
//            assertEquals(get.getTitle(), ds.getTitle());
//            assertEquals(get.getName(), ds.getName());
//            assertEquals(get.getNotes(), ds.getNotes());
//        } catch (CkanException e) {
//            System.out.println(e);
//        }
//    }
//
//    @Test
//    public void test_GetDatasetFail() {
//        Clientsss c = new Clientsss(new Connection("http://localhost", 5000),
//                GetTestCases.ApiKey);
//        try {
//            Dataset get = c.getDataset(UUID.randomUUID().toString());
//        } catch (CkanException e) {
//            assertEquals(e.getErrorMessages().size(), 2);
//        }
//    }
//
//    @Test
//    public void test_SearchDataset() {
//        Clientsss c = new Clientsss(new Connection("http://datahub.io"),
//                "");
//        try {
//            Dataset.SearchResults results = c.findDatasets("gold");
//            System.out.println("There are " + results.count + " results");
//            System.out.println(results.results);
//        } catch (CkanException e) {
//            assertEquals(e.getErrorMessages().size(), 2);
//        }
//    }
//
//    @Test
//    public void test_GetDatasetTDH() {
//        Clientsss c = new Clientsss(new Connection("http://datahub.io"),
//                "");
//        try {
//            Dataset get = c.getDataset("gold-prices");
//            System.out.println(get);
//
//            System.out.println(get.getExtras());
//            System.out.println(get.getTags());
//        } catch (CkanException e) {
//        }
//    }
//
//    @Test
//    public void test_GetGroupTDH() {
//        Clientsss c = new Clientsss(new Connection("http://datahub.io"),
//                "");
//        try {
//            Group get = c.getGroup("belarus_open_data");
//            System.out.println(get);
//        } catch (CkanException e) {
//            System.out.println(e);
//        }
//    }
//
//    /**
//     * Performs a search against the datahub, finding all of the datasets that
//     * have anything to do with gold.  Once found it will retrieve all of the
//     * resources related to those datasets.
//     **/
//    @Test
//    public void test_Example() {
//        // Create a new client with a connection to datahub.io, on the default
//        // port and with no api key required.
//        Clientsss client = new Clientsss(new Connection("http://datahub.io"), "");
//
//        try {
//            // Get the search results for the word gold
//            Dataset.SearchResults results = client.findDatasets("gold");
//            for (Dataset ds : results.results) {
//                int count = 0;
//
//                System.out.println("Adding resources from " + ds.getTitle() + "\n");
//                for (Resource rs : ds.getResources()) {
//                    count = count + 1;
//                    System.out.println(" " + count + ". " + rs.getName());
//                    System.out.println("    Format: " + rs.getFormat());
//                    System.out.println("    Mimetype: " + rs.getMimetype());
//                    System.out.println("    Description: " + rs.getDescription());
//                    System.out.println("    URL: " + rs.getUrl() + "\n");
//                }
//                System.out.println("");
//            }
//        } catch (CkanException e) {
//            System.out.println(e);
//        }
//    }

}
