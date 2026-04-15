package DesignPatterns.NullDesignPattern;

public class Car implements Vehicle{
    @Override
    public int getNoOfWheels() {
        return 4;
    }

    @Override
    public int getMaxSpeed() {
        return 100;
    }
}
