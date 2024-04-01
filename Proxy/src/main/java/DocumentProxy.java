
public class DocumentProxy implements Document {
    private Document document;
    private AccessControlService accessControlService;

    public DocumentProxy(Document document, AccessControlService accessControlService) {
        this.document = document;
        this.accessControlService = accessControlService;
    }

    @Override
    public String getDocumentId() {
        return document.getDocumentId();
    }

    @Override
    public String getCreationDate() {
        return document.getCreationDate();
    }

    @Override
    public String getContent() {
        if (accessControlService.isAllowed(document.getDocumentId(), User.getCurrentUser().getUsername())) {
            return document.getContent();
        } else {
            throw new AccessDeniedException("Document Access Denied: You are doomed.");
        }
    }
}
