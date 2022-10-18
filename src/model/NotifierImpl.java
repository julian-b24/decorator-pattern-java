package model;

public class NotifierImpl implements Notifier{

    @Override
    public String send(String message){
        return "Notification";
    }
}
