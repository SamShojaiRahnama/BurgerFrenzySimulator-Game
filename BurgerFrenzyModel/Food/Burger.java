package BurgerFrenzyModel.Food;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Burger class which handles the instances of burgers as well as its status and ingredients
 */

public class Burger extends Item {
    public enum Status {
        Raw, Fried, Burnt
    }
    protected ArrayList<Ingredient> ingredients;
    protected Status status;

    /**Burger class which handles the instances of burgers as well as its status and ingredients */
    public Burger(ArrayList<Ingredient> i)
    {
        if (i.isEmpty()) this.name = "burger";
        else{
            StringBuilder s = new StringBuilder();
            for(Ingredient ingredient : i)
                s.append(",").append(ingredient);
            this.name = "burger with" + s;
        }
        this.ingredients= i;
        this.ingredients.add(new Patty());
        this.ingredients.add(new Bun());
        this.status = Status.Raw;
    }

    /**
    * Provides a string representation of the burger, including its name and ingredients.
    *
    * @return A string describing the burger.
    */
    @Override
    public String toString() {return this.name;}

    /**
    * Changes the status of the burger to 'Fried'.
    */
    public void fry(){
        this.status = Status.Fried;
    }

    /**
    * Retrieves the list of ingredients used in the burger.
    *
    * @return ArrayList of Ingredient objects in the burger.
    */
    public ArrayList<Ingredient> getIngredients(){
        return ingredients;
    }
}

