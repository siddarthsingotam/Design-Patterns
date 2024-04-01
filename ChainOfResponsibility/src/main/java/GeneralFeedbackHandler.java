// Handler for general feedback messages
public class GeneralFeedbackHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(Message message) {
        if (message.getMessageType() == MessageType.GENERAL_FEEDBACK) {
            System.out.println("General feedback received and being analyzed and responded to...");
            // Analysis and response logic for general feedback
        } else if (nextHandler != null) {
            nextHandler.handleRequest(message);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}

