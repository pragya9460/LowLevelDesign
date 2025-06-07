package withStrategyDesignPattern;

import withStrategyDesignPattern.strategy.XYZDriveStrategy;

public class XYZVehicle extends Vehicle {
  public XYZVehicle() {
    super(new XYZDriveStrategy());
  }
}
