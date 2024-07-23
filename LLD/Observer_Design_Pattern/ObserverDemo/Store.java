package LLD.Observer_Design_Pattern.ObserverDemo;

import LLD.Observer_Design_Pattern.ObserverDemo.Observable.IphoneObservableImpl;
import LLD.Observer_Design_Pattern.ObserverDemo.Observable.StockObservable;
import LLD.Observer_Design_Pattern.ObserverDemo.Observer.EmailAlertObserverImpl;
import LLD.Observer_Design_Pattern.ObserverDemo.Observer.MobileAlertObserverImpl;
import LLD.Observer_Design_Pattern.ObserverDemo.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {

        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("abc_userName", iphoneStockObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("abc@gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);
        System.out.println("Current Stock: " + iphoneStockObservable.getStock());
        iphoneStockObservable.setStockCount(-10);
        System.out.println("Current Stock: " + iphoneStockObservable.getStock());
        iphoneStockObservable.setStockCount(100);
        System.out.println("Current Stock: " + iphoneStockObservable.getStock());
    }
}
