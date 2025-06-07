package withStrategyDesignPattern.strategy;

public class XYZDriveStrategy implements DriveStrategy {
  public XYZDriveStrategy() {
  }
  
  public void drive() {
    System.out.println("XYZ Capability");
  }
}
