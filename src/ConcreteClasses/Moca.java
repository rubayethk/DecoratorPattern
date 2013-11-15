package ConcreteClasses;

import AbstractClasses.Beverage;
import AbstractClasses.BeverageDecorator;

/**
 * Creator: Rubayeth Kamal
 * Date: 11/10/13
 * Time: 9:38 PM
 * Package: ConcreteClasses
 */
public class Moca extends BeverageDecorator {
    Beverage beverage;
    public Moca(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return "Moca, " + beverage.getDescription();
    }

    @Override
    public double getCost() {
        return 0.10 + beverage.getCost();
    }
}
