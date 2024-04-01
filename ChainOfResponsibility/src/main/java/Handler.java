// Handler interface for handling feedback messages
public interface Handler {
    void handleRequest(Message message);
    void setNextHandler(Handler handler);
}
