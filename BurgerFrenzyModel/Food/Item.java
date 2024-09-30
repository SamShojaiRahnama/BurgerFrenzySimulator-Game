package BurgerFrenzyModel.Food;

import BurgerFrenzyModel.Plate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 Item is an abstract class to keep track of all the food in Burger Frenzy
 __________________________
 attribute:
 name

 methods:
 getName()
 */
public abstract class Item{
    //attributes
    protected String name;

    /**
     * Retrieves the name of the item.
     * This method is used to get the name of any item that extends this class.
     * @return String representing the name of the item.
     */
    //methods
    public String getName(){return name;}
}
