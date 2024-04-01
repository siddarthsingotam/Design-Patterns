
public class Main {
    public static void main(String[] args) {
        // Create the handlers below
        Handler compensationClaimHandler = new CompensationClaimHandler();
        Handler contactRequestHandler = new ContactRequestHandler();
        Handler developmentSuggestionHandler = new DevelopmentSuggestionHandler();
        Handler generalFeedbackHandler = new GeneralFeedbackHandler();

        // Chain the handlers
        compensationClaimHandler.setNextHandler(contactRequestHandler);
        contactRequestHandler.setNextHandler(developmentSuggestionHandler);
        developmentSuggestionHandler.setNextHandler(generalFeedbackHandler);

        // Generate various types of feedback messages below
        Message message1 = new Message(MessageType.COMPENSATION_CLAIM, "Claim details", "sender1@example.com");
        Message message2 = new Message(MessageType.CONTACT_REQUEST, "Contact details", "sender2@example.com");
        Message message3 = new Message(MessageType.DEVELOPMENT_SUGGESTION, "Suggestion details", "sender3@example.com");
        Message message4 = new Message(MessageType.GENERAL_FEEDBACK, "Feedback details", "sender4@example.com");

        // Send messages to the handler chain to handle the given reqs
        compensationClaimHandler.handleRequest(message1);
        compensationClaimHandler.handleRequest(message2);
        compensationClaimHandler.handleRequest(message3);
        compensationClaimHandler.handleRequest(message4);
    }
}
