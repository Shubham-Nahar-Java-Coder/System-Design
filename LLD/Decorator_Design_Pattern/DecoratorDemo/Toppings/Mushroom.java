package LLD.Decorator_Design_Pattern.DecoratorDemo.Toppings;

import LLD.Decorator_Design_Pattern.DecoratorDemo.BasePizza.BasePizza;

public class Mushroom extends ToppingDecorator{


    public Mushroom(BasePizza pizza){
        super(pizza);
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
