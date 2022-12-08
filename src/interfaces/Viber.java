package interfaces;

public class Viber implements Messenger {

    @Override
    public void start() {
        System.out.println("Viber is starting");
    }

//    @Override
//    public void shutdown() {
//        System.out.println("Viber exiting");
//    }

    @Override
    public void sendMessage(MessageType type) {
        switch (type) {
            case TEXT -> System.out.println("Viber sends text message");
            case PICTURE -> System.out.println("Viber sends message with picture");
            case SMILE -> System.out.println("Viber sends smile");
        }
    }
}
