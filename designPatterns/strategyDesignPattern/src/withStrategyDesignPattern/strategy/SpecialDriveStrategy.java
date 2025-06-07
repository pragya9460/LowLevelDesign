package withStrategyDesignPattern.strategy;

public class SpecialDriveStrategy implements DriveStrategy {
  public SpecialDriveStrategy() {
  }
  
  public void drive() {
    System.out.println("Special Capability");
  }
}
