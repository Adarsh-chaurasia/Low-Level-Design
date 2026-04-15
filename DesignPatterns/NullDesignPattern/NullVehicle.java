package DesignPatterns.NullDesignPattern;

public class NullVehicle implements Vehicle{

    @Override
    public int getNoOfWheels() {
        return 0;
    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }
}
