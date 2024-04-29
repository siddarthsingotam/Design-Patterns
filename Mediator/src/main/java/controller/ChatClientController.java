package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import mediator.ChatMediator;
import model.ChatClient;

public class ChatClientController {
    @FXML
    private TextArea chatArea;
    @FXML
    private TextField messageField;
    @FXML
    private ComboBox<String> recipientBox;
    @FXML
    private Button sendButton;

    private ChatClient chatClient;

    public void initialize(ChatMediator mediator, String username) {
        chatClient = new ChatClient(username, mediator);
        // Initialize recipientBox with available recipients
    }

    @FXML
    private void handleSendButton(ActionEvent event) {
        String message = messageField.getText();
        String recipient = recipientBox.getValue();
        if (message != null && !message.isEmpty() && recipient != null && !recipient.isEmpty()) {
            chatClient.sendMessage(message, recipient);
            // Clear message field after sending
            messageField.clear();
        }
    }
}
