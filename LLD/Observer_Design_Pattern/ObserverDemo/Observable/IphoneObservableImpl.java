package LLD.Observer_Design_Pattern.ObserverDemo.Observable;

import java.util.ArrayList;
import java.util.List;

import LLD.Observer_Design_Pattern.ObserverDemo.Observer.NotificationAlertObserver;

public class IphoneObservableImpl implements StockObservable {

    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stockCount == 0) {
            notifySubscribers();
        }

        stockCount = stockCount + newStockAdded;
    }

    @Override
    public int getStock() {
        return stockCount;
    }
}
