public class Jalapeno extends ToppingsDecorator {
  BasePizza basePizza;
  
  public Jalapeno(BasePizza basePizza) {
    this.basePizza = basePizza;
  }
  
  public int cost() {
    return this.basePizza.cost() + 40;
  }
}