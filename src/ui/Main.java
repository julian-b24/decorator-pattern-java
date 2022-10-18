package ui;

import model.Facebook;
import model.Notifier;
import model.NotifierImpl;
import model.SMS;

public class Main {

    public final static String MESSAGE = "New message";

    public static void main(String[] args) {
        sendDefaultNotification(); //"New message"
        sendFacebookNotification(); //"New message check Facebook"
        sendMultipleAppNotification(); // "New message check Facebook check SMS"
    }

    private static void sendDefaultNotification(){
        Notifier defaultNotification = new NotifierImpl();
        System.out.println(defaultNotification.send(MESSAGE));
    }

    private static void sendFacebookNotification(){
        Notifier defaultNotification = new Facebook(new NotifierImpl());
        System.out.println(defaultNotification.send(MESSAGE));
    }

    private static void sendMultipleAppNotification(){
        Notifier defaultNotification = new SMS(new Facebook(new NotifierImpl()));
        System.out.println(defaultNotification.send(MESSAGE));
    }

}
