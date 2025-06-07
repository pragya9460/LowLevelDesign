package withStrategyDesignPattern;

import withStrategyDesignPattern.strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
  public PassengerVehicle() {
    super(new NormalDriveStrategy());
  }
}
