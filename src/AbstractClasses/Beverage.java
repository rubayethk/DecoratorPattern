package AbstractClasses;

/**
 * Creator: Rubayeth Kamal
 * Date: 11/10/13
 * Time: 9:17 PM
 * Package: AbstractClasses
 */
public abstract class Beverage {
    public String description = "Unknown";

    public String getDescription(){
        return description;
    }
    public abstract double getCost();
}
