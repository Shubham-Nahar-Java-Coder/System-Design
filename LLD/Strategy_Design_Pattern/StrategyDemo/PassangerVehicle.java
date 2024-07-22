package LLD.Strategy_Design_Pattern.StrategyDemo;

import LLD.Strategy_Design_Pattern.StrategyDemo.DriveStrategyInterface.NormalDriveStrategy;

public class PassangerVehicle extends Vehicle {

    PassangerVehicle() {
        super(new NormalDriveStrategy());
    }
    
}
