package LLD.Strategy_Design_Pattern.StrategyDemo;

public class Main{
    public static void main(String[] args) {

        Vehicle vehicle = new SportyVehicle();
        vehicle.drive();

        Vehicle vehicle2 = new PassangerVehicle();
        vehicle2.drive();
    }
}