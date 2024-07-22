package LLD.Strategy_Design_Pattern.StrategyDemo;

import LLD.Strategy_Design_Pattern.StrategyDemo.DriveStrategyInterface.DriveStrategy;

public class Vehicle {

    // DriveStartegy driveStartegy = new NormalDriveStrategy(); 
    //We are not doing this or else it will be bonded and we will have to create keep creating objects.
    // So we created an object of interface and constructor injection 

    DriveStrategy driveStartegyObject;
    
    Vehicle(DriveStrategy driveObj){
        this.driveStartegyObject = driveObj;
    }

    public void drive(){
        driveStartegyObject.drive();
    }
}
