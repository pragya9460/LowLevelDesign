package observer;

import observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
  String mobileNumber;
  StocksObservable stocksObservable;
  
  public MobileAlertObserverImpl(String mobileNumber, StocksObservable stocksObservable) {
    this.mobileNumber = mobileNumber;
    this.stocksObservable = stocksObservable;
    stocksObservable.add(this);
  }
  
  public void update() {
    this.sendSMS(this.mobileNumber, "Product is in stock, hurry up!");
  }
  
  public void sendSMS(String mobileNumber, String message) {
    System.out.println("Sending SMS to " + mobileNumber + ": " + message);
  }
}

