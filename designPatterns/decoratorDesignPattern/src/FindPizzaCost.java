public class FindPizzaCost {
  public FindPizzaCost() {
  }
  
  public static void main(String[] args) {
    BasePizza pizza1 = new Mushroom(new Margareta());
    System.out.println("Cost of pizza with mushroom: " + ((BasePizza)pizza1).cost());
    BasePizza pizza2 = new Mushroom(new Mushroom(new Margareta()));
    System.out.println("Cost of pizza with two mushrooms: " + ((BasePizza)pizza2).cost());
    BasePizza pizza3 = new ExtraVeggies(new ExtraCheese(new Mushroom(new Margareta())));
    System.out.println("Cost of pizza with mushroom, extra cheese and extra veggies: " + ((BasePizza)pizza3).cost());
    BasePizza pizza4 = new ExtraVeggies(new Jalapeno(new Farmhouse()));
    System.out.println("Cost of pizza with farmhouse, extra cheese and extra veggies: " + ((BasePizza)pizza4).cost());
    BasePizza pizza5 = new ExtraVeggies(new ExtraCheese(new Mushroom(new Farmhouse())));
    System.out.println("Cost of pizza with farmhouse, mushroom, extra cheese and extra veggies: " + ((BasePizza)pizza5).cost());
  }
}