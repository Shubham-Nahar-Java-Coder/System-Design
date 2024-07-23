package LLD.Observer_Design_Pattern.ObserverDemo.Observer;

import LLD.Observer_Design_Pattern.ObserverDemo.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String emailId, StockObservable observable){
        this.userName = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "Product is back in Stock");
    }

    private void sendMsgOnMobile(String userName, String msg) {
        System.out.println("Message sent to: "+userName);
    }
    
}
