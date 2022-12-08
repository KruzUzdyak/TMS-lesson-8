package interfaces;

public interface Messenger extends Application {

    void sendMessage(MessageType type);

    static void currentDate() {
        System.out.println("message sended on " + Application.DATE);
    }
}
