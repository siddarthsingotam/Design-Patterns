public class Main {
    public static void main(String[] args) {
        // Create users
        User user1 = new User("user1");
        //User user2 = new User("user2");

        // Set current user
        User.setCurrentUser(user1);

        // Create Access Control Service
        AccessControlService accessControlService = AccessControlService.getInstance();
        accessControlService.grantAccess("doc1", "user1"); // user1 only has access to doc1 and not doc2

        // Create Library and add documents
        Library library = new Library();
        addDocumentsToLibrary(library, accessControlService);

        // Demonstration
        try {
            System.out.println("Document 1 Content: " + library.getDocument("doc1").getContent()); // Access allowed
            System.out.println("Document 2 Content: " + library.getDocument("doc2").getContent()); // Access denied
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addDocumentsToLibrary(Library library, AccessControlService accessControlService) {
        Document doc1 = createDocument("doc1", "2022-04-01", "Content of Document 1");
        Document doc2 = createDocument("doc2", "2022-04-02", "Content of Document 2");

        library.addDocument("doc1", doc1);
        library.addProtectedDocument("doc2", doc2, accessControlService);
    }

    private static Document createDocument(String documentId, String creationDate, String content) {
        return new Document() {
            @Override
            public String getDocumentId() {
                return documentId;
            }

            @Override
            public String getCreationDate() {
                return creationDate;
            }

            @Override
            public String getContent() {
                return content;
            }
        };
    }
}
