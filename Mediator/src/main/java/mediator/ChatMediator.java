package mediator;

import model.ChatClient;

public interface ChatMediator {
    void sendMessage(String message, String sender, String recipient);
    void registerClient(ChatClient client);
}

