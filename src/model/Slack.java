package model;

public class Slack extends BaseDecorator{

    public Slack(Notifier notifier) {
        super(notifier);
    }

    @Override
    public String send(String message) {
        return super.send(message) + decorateWithSlack();
    }

    private String decorateWithSlack(){
        return " check Slack";
    }
}
