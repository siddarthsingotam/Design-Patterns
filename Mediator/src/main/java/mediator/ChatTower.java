package mediator;

import model.ChatClient;

import java.util.ArrayList;
import java.util.List;

public class ChatTower implements ChatMediator {
    private List<ChatClient> clients;

    public ChatTower() {
        this.clients = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, String sender, String recipient) {
        for (ChatClient client : clients) {
            if (client.getUsername().equals(recipient)) {
                client.receiveMessage(message, sender);
                break;
            }
        }
    }

    @Override
    public void registerClient(ChatClient client) {
        clients.add(client);
    }
}
