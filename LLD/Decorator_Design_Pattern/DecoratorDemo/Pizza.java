package LLD.Decorator_Design_Pattern.DecoratorDemo;

import LLD.Decorator_Design_Pattern.DecoratorDemo.BasePizza.BasePizza;
import LLD.Decorator_Design_Pattern.DecoratorDemo.BasePizza.Margherita;
import LLD.Decorator_Design_Pattern.DecoratorDemo.Toppings.ExtraCheese;
import LLD.Decorator_Design_Pattern.DecoratorDemo.Toppings.Mushroom;

public class Pizza {
    
    public static void main(String[] args) {
        BasePizza pizza = new ExtraCheese(new Mushroom(new Margherita()));
        System.out.println(pizza.cost());
    }
}
