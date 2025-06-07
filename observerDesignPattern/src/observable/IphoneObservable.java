package observable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import observer.NotificationAlertObserver;

public class IphoneObservable implements StocksObservable {
  public List<NotificationAlertObserver> observerList = new ArrayList();
  public int stockCount = 0;
  
  public IphoneObservable() {
  }
  
  public void add(NotificationAlertObserver observer) {
    this.observerList.add(observer);
  }
  
  public void remove(NotificationAlertObserver observer) {
    this.observerList.remove(observer);
  }
  
  public void notifySubscribers() {
    Iterator var1 = this.observerList.iterator();
    
    while(var1.hasNext()) {
      NotificationAlertObserver observer = (NotificationAlertObserver)var1.next();
      observer.update();
    }
    
  }
  
  public void setStockCount(int stockCount) {
    if (this.stockCount == 0) {
      this.notifySubscribers();
    }
    
    this.stockCount = stockCount;
  }
  
  public int getStockCount() {
    return this.stockCount;
  }
}

