package interfaces;

public class Chrome implements Application {

    @Override
    public void start() {
        System.out.println("Chrome is starting");
    }

    @Override
    public void shutdown() {
        System.out.println("Chrome exiting");
    }
}
