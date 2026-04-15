package DesignPatterns.FactoryDesignPattern;

public class ShapeFactory {

    private Shape shape;

    public ShapeFactory(int choice){

        if(choice == 1){
            shape = new Square();
        }

        else if (choice == 2){
            shape = new Circle();
        }

    }

    public Shape getShape() {
        return shape;
    }
}
