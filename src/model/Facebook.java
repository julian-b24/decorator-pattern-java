package model;

public class Facebook extends BaseDecorator{

    public Facebook(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send(String message) {
        return super.send(message) + decorateWithFacebook();
    }

    private String decorateWithFacebook(){
        return " check Facebook";
    }

}
