package ConcreteClasses;

import AbstractClasses.Beverage;
import AbstractClasses.BeverageDecorator;

/**
 * Creator: Rubayeth Kamal
 * Date: 11/10/13
 * Time: 9:43 PM
 * Package: ConcreteClasses
 */
public class Whip extends BeverageDecorator {
    Beverage beverage;
    public Whip(Beverage beverage) {
       this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Whip, " + beverage.getDescription();
    }

    @Override
    public double getCost() {
        return 0.20 + beverage.getCost();
    }
}
