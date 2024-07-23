package LLD.Decorator_Design_Pattern.DecoratorDemo.Toppings;

import LLD.Decorator_Design_Pattern.DecoratorDemo.BasePizza.BasePizza;

public class ExtraCheese extends ToppingDecorator {

    public ExtraCheese(BasePizza pizza){
        super(pizza);
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
