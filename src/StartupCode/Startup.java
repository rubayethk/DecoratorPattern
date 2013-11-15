package StartupCode;

import AbstractClasses.Beverage;
import ConcreteClasses.DarkRoasted;
import ConcreteClasses.Espresso;
import ConcreteClasses.Moca;
import ConcreteClasses.Whip;

/**
 * Creator: Rubayeth Kamal
 * Date: 11/10/13
 * Time: 9:50 PM
 * Package: StartupCode
 */
public class Startup{

    public static void main(String[] args) {
        Beverage item = new DarkRoasted();
        item = new Whip(item);
        item = new Moca(item);

        System.out.println(item.getDescription());
        System.out.println(item.getCost());

//        Beverage item2 = new Espresso();
//        item2 = new Whip(item2);
//        item2 = new Moca(item2);
//
//        System.out.println(item2.getDescription());
//        System.out.println(item2.getCost());
    }

}
