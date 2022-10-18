package model;

public abstract class BaseDecorator implements Notifier{

    private Notifier notifier; //wrapper in class diagram

    public BaseDecorator(Notifier notifier){
        this.notifier = notifier;
    }

    @Override
    public String send(String message) {
        return notifier.send(message);
    }
}
