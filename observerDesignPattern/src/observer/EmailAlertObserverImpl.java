package observer;

import observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
  String emailId;
  StocksObservable stocksObservable;
  
  public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable) {
    this.emailId = emailId;
    this.stocksObservable = stocksObservable;
    stocksObservable.add(this);
  }
  
  public void update() {
    this.sendEmail(this.emailId, "Product is in stock, hurry up!");
  }
  
  public void sendEmail(String emailId, String message) {
    System.out.println("Sending email to " + emailId + ": " + message);
  }
}

