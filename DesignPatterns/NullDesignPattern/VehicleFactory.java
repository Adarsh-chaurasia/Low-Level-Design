package DesignPatterns.NullDesignPattern;

public class VehicleFactory {

    static Vehicle getVehicleObject(String vehicle){

        if(vehicle.equalsIgnoreCase("CAR")){
            return new Car();
        }

        return new NullVehicle();

    }
}
