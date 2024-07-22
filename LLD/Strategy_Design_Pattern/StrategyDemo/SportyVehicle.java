package LLD.Strategy_Design_Pattern.StrategyDemo;

import LLD.Strategy_Design_Pattern.StrategyDemo.DriveStrategyInterface.SpecialDrive;

public class SportyVehicle extends Vehicle{

    SportyVehicle() {
        super(new SpecialDrive());
    }
    
}
