package interfaces;

public class Telegram implements Messenger {

    public Telegram() {

    }

    @Override
    public void sendMessage(MessageType type) {
        Messenger.currentDate();
        switch (type) {
            case TEXT -> System.out.println("Telegram sends text message");
            case PICTURE -> System.out.println("Telegram sends message with picture");
            case SMILE -> System.out.println("Telegram sends smile");
        }
    }

    @Override
    public void start() {
        Application.currentDate();
        System.out.println("Telegram is starting");
    }

//    @Override
//    public void shutdown() {
//        System.out.println("Telegram shutdown");
//    }
}
