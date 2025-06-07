public class ExtraCheese extends ToppingsDecorator {
  BasePizza basePizza;
  
  public ExtraCheese(BasePizza basePizza) {
    this.basePizza = basePizza;
  }
  
  public int cost() {
    return this.basePizza.cost() + 50;
  }
}
