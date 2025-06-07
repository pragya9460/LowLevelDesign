public class ExtraVeggies extends ToppingsDecorator {
  BasePizza basePizza;
  
  public ExtraVeggies(BasePizza basePizza) {
    this.basePizza = basePizza;
  }
  
  public int cost() {
    return this.basePizza.cost() + 30;
  }
}

