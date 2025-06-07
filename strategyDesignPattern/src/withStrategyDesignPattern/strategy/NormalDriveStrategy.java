package withStrategyDesignPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy {
  public NormalDriveStrategy() {
  }
  
  public void drive() {
    System.out.println("Normal Capability");
  }
}
