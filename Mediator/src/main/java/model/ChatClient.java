package model;

import mediator.ChatMediator;

public class ChatClient {
    private String username;
    private ChatMediator mediator;

    public ChatClient(String username, ChatMediator mediator) {
        this.username = username;
        this.mediator = mediator;
        mediator.registerClient(this);
    }

    public String getUsername() {
        return username;
    }

    public void sendMessage(String message, String recipient) {
        mediator.sendMessage(message, username, recipient);
    }

    public void receiveMessage(String message, String sender) {
        // Display received message in UI
        System.out.println(sender + ": " + message);
    }
}

