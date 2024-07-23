package LLD.Observer_Design_Pattern.ObserverDemo.Observer;

import LLD.Observer_Design_Pattern.ObserverDemo.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    
    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
        }

    @Override
    public void update() {
        sendMail(emailId, "Product is back in Stock");
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("mail sent to: "+emailId);
    }
}
