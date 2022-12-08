package interfaces;

public interface Application {

    static String DATE = "08.12";

    void start();

    default void shutdown() {
        print("Application exiting");
    }

    private void print(String text) {
        System.out.println(text);
    }

    static void currentDate() {
        System.out.println("Current date is " + DATE);
    }
}
