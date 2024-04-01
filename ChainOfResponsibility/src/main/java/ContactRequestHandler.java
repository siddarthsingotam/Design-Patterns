
// Handler for contact request messages
public class ContactRequestHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(Message message) {
        if (message.getMessageType() == MessageType.CONTACT_REQUEST) {
            System.out.println("Contact request received and being forwarded to the appropriate department...");
            // Forwarding logic for contact requests
        } else if (nextHandler != null) {
            nextHandler.handleRequest(message);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
