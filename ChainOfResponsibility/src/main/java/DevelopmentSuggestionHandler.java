
// Handler for development suggestion messages
public class DevelopmentSuggestionHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(Message message) {
        if (message.getMessageType() == MessageType.DEVELOPMENT_SUGGESTION) {
            System.out.println("Development suggestion received and being logged and prioritized...");
            // Logging and prioritization logic for development suggestions
        } else if (nextHandler != null) {
            nextHandler.handleRequest(message);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
