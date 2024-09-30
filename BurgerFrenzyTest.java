import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import BurgerFrenzyModel.*;
import BurgerFrenzyModel.Food.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BurgerFrenzyTest {

    //Game Condition Folder Test Cases
    @Test
    void xpWinTest() throws IOException {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer());
        BurgerFrenzyGame model = new BurgerFrenzyGame(new int[]{100, 200, 300}, 100,  customers);
        model.addIngredient(new Lettuce());
        model.addIngredient(new Tomato());
        model.addIngredient(new Patty());
        model.addIngredient(new Bun());
        model.getXpState().getCurrentCustomer().order.isDone = true;
        model.getPlayer().update();
        assertEquals(100, model.getXpState().getXP());
    }

    @Test
    void xpLoseTest() throws IOException {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer());
        BurgerFrenzyGame model = new BurgerFrenzyGame(new int[]{100, 200, 300}, 100,  customers);
        model.addIngredient(new Lettuce());
        model.addIngredient(new Tomato());
        model.addIngredient(new Patty());
        model.getXpState().getCurrentCustomer().order.isDone = true;
        model.getPlayer().update();
        assertEquals(-10, model.getXpState().getXP());
    }

    //Food Initializer Test Cases
    @Test
    void burgerConstructorWithNoIngredientsTest() {
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        Burger burger = new Burger(ingredients);

        assertEquals("burger", burger.toString());
    }

    @Test
    void burgerFryMethodTest() {
        Burger burger = new Burger(new ArrayList<>());
        ArrayList<Ingredient> x = burger.getIngredients();

        assertFalse(x.isEmpty());
    }

    @Test
    void cheeseConstructorTest() {
        Cheese cheese = new Cheese();
        assertEquals("Cheese", cheese.getName()); 
    }


    //Customer-States Test Cases
    @Test
    void customerInitializationTest() {
        Customer customer = new Customer();

        assertNotNull(customer.order);
        assertTrue(customer.state instanceof HappyState);
        assertNotNull(customer.patience);
    }

    @Test
    void customerEnterDecreasesPatienceTest() {
        Customer customer = new Customer();
        double initialPatience = customer.patience.getPatience();
        customer.CustomerEnter();
        assertTrue(customer.patience.getPatience() <= initialPatience);
    }

    @Test
    void handleStateChangesToNeutralForModeratePatience() {
        Customer customer = new Customer();

        CustomerState state = new HappyState();
        state.handleState(customer);

        assertTrue(customer.state instanceof HappyState);
    }


    //Customer Patience Test Cases

    @Test
    void patienceAndCustomerStateTest() throws IOException {
        Customer customer = new Customer();
        assertEquals(customer.patience.getPatience(), 300.0);
        assertInstanceOf(HappyState.class, customer.state);
    }


    //Order and Order-Factory Test Cases

    @Test
    void orderFactoryTest() throws IOException {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer());
        BurgerFrenzyGame model = new BurgerFrenzyGame(new int[]{100, 200, 300}, 100,  customers);
        assertInstanceOf(Burger.class, model.getXpState().getCurrentCustomer().order.getItems().get(0));
    }

    @Test
    void isCustomerDoneShouldReturnTrueWhenOrderMatchesPlate() {

        Item lettuce = new Lettuce();
        Item tomato = new Tomato();
        ArrayList<Item> orderItems = new ArrayList<>();
        orderItems.add(lettuce);
        orderItems.add(tomato);
        Order order = new Order(orderItems);


        Plate plate = new Plate();
        plate.addIngredient(lettuce);
        plate.addIngredient(tomato);

        assertTrue(order.isCustomerDone(plate));
    }


    //Scoreboard Test Cases

    @Test
    void testAddAndGetScore() {
        Scoreboard scoreboard = new Scoreboard();
        scoreboard.addScore("Player1", 100);

        List<Scoreboard.PlayerScore> scores = scoreboard.getScores();
        assertFalse(scores.isEmpty());
        assertEquals(1, scores.size());
        assertEquals("Player1", scores.get(0).getPlayerName());
        assertEquals(100, scores.get(0).getXp());
    }

    @Test
    void testScoreboardLimitsToTopTenScores() {
        Scoreboard scoreboard = new Scoreboard();
        for (int i = 0; i < 15; i++) {
            scoreboard.addScore("Player" + i, i * 10);
        }

        List<Scoreboard.PlayerScore> scores = scoreboard.getScores();
        assertEquals(10, scores.size());
        assertEquals("Player14", scores.get(0).getPlayerName());
        assertEquals(140, scores.get(0).getXp());
    }



    //Plate Test Cases

    @Test
    void testAddIngredientAndTrashPlate() {
        Plate plate = new Plate();
        Item ingredient1 = new Bun();
        Item ingredient2 = new Tomato();

        plate.addIngredient(ingredient1);
        plate.addIngredient(ingredient2);

        // Check if both items are added
        HashSet<String> expectedItems = new HashSet<>();
        expectedItems.add(ingredient1.getName());
        expectedItems.add(ingredient2.getName());
        assertEquals(expectedItems, plate.getItems());

        // Test trashPlate
        plate.trashPlate();
        assertTrue(plate.getItems().isEmpty());
        assertFalse(plate.getItems().contains("Bun"));
    }


}

