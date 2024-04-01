
import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Document> documents;

    public Library() {
        documents = new HashMap<>();
    }

    public void addDocument(String documentId, Document document) {
        documents.put(documentId, document);
    }

    public void addProtectedDocument(String documentId, Document document, AccessControlService accessControlService) {
        Document proxy = new DocumentProxy(document, accessControlService);
        documents.put(documentId, proxy);
    }

    public Document getDocument(String documentId) {
        return documents.get(documentId);
    }
}
