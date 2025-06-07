package observable;

import observer.NotificationAlertObserver;

public interface StocksObservable {
  void add(NotificationAlertObserver var1);
  
  void remove(NotificationAlertObserver var1);
  
  void notifySubscribers();
  
  void setStockCount(int var1);
  
  int getStockCount();
}

