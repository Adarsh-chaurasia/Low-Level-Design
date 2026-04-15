package DesignPatterns.DecoratorPattern;

public class Main {

    public static void main(String[] args){
        BasePizza pizza = new ExtraCheese(new CheesePizza());

        System.out.println(pizza.cost());


    }


}
