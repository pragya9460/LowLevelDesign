import observable.IphoneObservable;
import observable.StocksObservable;
import observer.EmailAlertObserverImpl;
import observer.MobileAlertObserverImpl;

public class Store {
  public Store() {
  }
  
  public static void main(String[] args) {
    StocksObservable iphoneObservable = new IphoneObservable();
    new EmailAlertObserverImpl("abc.email.com", iphoneObservable);
    new EmailAlertObserverImpl("xyz.email.com", iphoneObservable);
    new MobileAlertObserverImpl("1234567890", iphoneObservable);
    iphoneObservable.setStockCount(10);
    new MobileAlertObserverImpl("0987654321", iphoneObservable);
    iphoneObservable.setStockCount(0);
    iphoneObservable.setStockCount(100);
  }
}