// Handler for compensation claim messages
public class CompensationClaimHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void handleRequest(Message message) {
        if (message.getMessageType() == MessageType.COMPENSATION_CLAIM) {
            System.out.println("Compensation claim received and being processed...");
            // Processing logic for compensation claims
        } else if (nextHandler != null) {
            nextHandler.handleRequest(message);
        }
    }

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }
}
