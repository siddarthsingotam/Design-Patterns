import java.util.HashMap;
import java.util.Map;

public class AccessControlService {
    private static AccessControlService instance;
    private Map<String, String> accessList;

    private AccessControlService() {
        accessList = new HashMap<>();
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public void grantAccess(String documentId, String username) {
        accessList.put(documentId, username);
    }

    public boolean isAllowed(String documentId, String username) {
        String allowedUser = accessList.get(documentId);
        return allowedUser != null && allowedUser.equals(username);
    }
}

