package LLD.Decorator_Design_Pattern.DecoratorDemo.Toppings;

import LLD.Decorator_Design_Pattern.DecoratorDemo.BasePizza.BasePizza;

public abstract class ToppingDecorator extends BasePizza {
    
    protected BasePizza basePizza;
    
    public ToppingDecorator(BasePizza pizza){
        this.basePizza = pizza;
    }
}
