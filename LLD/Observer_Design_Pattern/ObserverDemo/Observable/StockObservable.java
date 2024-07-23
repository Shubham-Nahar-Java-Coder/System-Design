package LLD.Observer_Design_Pattern.ObserverDemo.Observable;

import LLD.Observer_Design_Pattern.ObserverDemo.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int newStockAdded);

    public int getStock();
}
