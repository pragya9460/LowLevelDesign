public class ShapeFactory {
  public ShapeFactory() {
  }
  
  Shape getShape(String input) {
    Object var10000;
    switch (input) {
      case "Circle" -> var10000 = new Circle();
      case "Rectangle" -> var10000 = new Rectangle();
      case "Square" -> var10000 = new Square();
      default -> var10000 = null;
    }
    
    return (Shape)var10000;
  }
}