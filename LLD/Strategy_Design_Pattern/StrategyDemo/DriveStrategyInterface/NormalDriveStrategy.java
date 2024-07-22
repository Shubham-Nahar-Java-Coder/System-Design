package LLD.Strategy_Design_Pattern.StrategyDemo.DriveStrategyInterface;

public class NormalDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }

}
