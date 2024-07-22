package LLD.Strategy_Design_Pattern.StrategyDemo;

import LLD.Strategy_Design_Pattern.StrategyDemo.DriveStrategyInterface.SpecialDrive;

public class OffRoadVehcile extends Vehicle {

    OffRoadVehcile() {
        super(new SpecialDrive());
    }
    
}
