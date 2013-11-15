package ConcreteClasses;

import AbstractClasses.Beverage;

/**
 * Creator: Rubayeth Kamal
 * Date: 11/10/13
 * Time: 9:30 PM
 * Package: ConcreteClasses
 */
public class DarkRoasted extends Beverage {

    public DarkRoasted() {
      description = "Dark Roasted";
    }

    @Override
    public double getCost() {
        return 1.99;

    }

    //TODO: implement using interfaces
}
