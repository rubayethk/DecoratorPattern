package ConcreteClasses;

import AbstractClasses.Beverage;
import com.sun.tools.javac.comp.Todo;

/**
 * Creator: Rubayeth Kamal
 * Date: 11/10/13
 * Time: 9:34 PM
 * Package: ConcreteClasses
 */
public class Espresso extends Beverage {
    String description;
    int id;

    public Espresso() {
       description = "Espresso";

    }

    @Override
    public double getCost() {
        return 2.0;
    }

    // TODO:implement using interfaces.
}

