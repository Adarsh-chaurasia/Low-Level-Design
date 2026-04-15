package DesignPatterns.DecoratorPattern;

public class ExtraCheese extends Toppings{

    BasePizza pizza;
    public ExtraCheese(BasePizza newPizza){

        this.pizza =  newPizza;

    }
    @Override
    public int cost() {
        return this.pizza.cost() + 50;
    }
}
