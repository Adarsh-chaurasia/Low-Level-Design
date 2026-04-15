package FactoryDesignPattern;

public class Main {


    public static void main(String[] args){

        ShapeFactory shape = new ShapeFactory(2);

        shape.getShape().printShape();


    }
}
