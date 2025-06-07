package withStrategyDesignPattern;

import withStrategyDesignPattern.strategy.NormalDriveStrategy;

public class SportyVehicle extends Vehicle {
  public SportyVehicle() {
    super(new NormalDriveStrategy());
  }
}
