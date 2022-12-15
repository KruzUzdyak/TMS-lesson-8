package interfaces;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Telegram t1 = new Telegram();
        Application t2 = new Telegram();
        Chrome c1 = new Chrome();
        Viber v1 = new Viber();



        Application.currentDate();

        Application[] apps = new Application[]{t1, t2, c1, v1};

        System.out.println(Arrays.toString(apps));

        for (Application app : apps) {
            app.start();
        }

        Messenger[] messengers = new Messenger[]{t1, (Messenger) t2, v1};

        messengers[0].sendMessage(MessageType.TEXT);
        messengers[1].sendMessage(MessageType.PICTURE);
        messengers[2].sendMessage(MessageType.SMILE);
        String smile = "SMILE";

        System.out.println("---------");
        t1.sendMessage(MessageType.valueOf(smile));


        for (int i=0; i< messengers.length; i++){
//            messengers[i].sendMessage(MessageType.v`);
        }

        System.out.println("---------");

        for (Application app : apps) {
            app.shutdown();
        }

        System.out.println(" ------------ ");
        for (Application app : apps) {
            if (app instanceof Chrome) {
                System.out.println("this is chrome");
            } else if (app instanceof Messenger) {
                System.out.println("this is messenger");
            } else {
                System.out.println("unknown");
            }
        }
    }
}
