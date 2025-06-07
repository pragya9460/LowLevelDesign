package withStrategyDesignPattern;

import withStrategyDesignPattern.strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle {
  public OffRoadVehicle() {
    super(new SpecialDriveStrategy());
  }
}
