import java.util.Iterator;
import java.util.List;
import withStrategyDesignPattern.OffRoadVehicle;
import withStrategyDesignPattern.PassengerVehicle;
import withStrategyDesignPattern.SportyVehicle;
import withStrategyDesignPattern.Vehicle;
import withStrategyDesignPattern.XYZVehicle;

public class Main {
  
  public static void main(String[] args) {
    List<Vehicle> vehicles = List.of(new SportyVehicle(), new OffRoadVehicle(), new PassengerVehicle(), new XYZVehicle());
    System.out.println("========Printing driving capability of each vehicles==========");
    Iterator var2 = vehicles.iterator();
    
    while(var2.hasNext()) {
      Vehicle v = (Vehicle)var2.next();
      v.drive();
    }
  }
}