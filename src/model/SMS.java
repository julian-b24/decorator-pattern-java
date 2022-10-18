package model;

public class SMS extends BaseDecorator{

    public SMS(Notifier notifier){
        super(notifier);
    }

    @Override
    public String send(String message) {
        return super.send(message) + decorateWithSMS();
    }

    private String decorateWithSMS(){
        return " check SMS";
    }

}
