import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {
    //    INSTANCE VARIABLES
    protected int price;
    protected int planePizza = 300;
    protected boolean veg;
    protected int addToppings = 150;
    protected int addCheese = 100;
    protected int buyBag = 20;

    //adding variables to check if the other items were added into the base pizza
    //TODO: see why you created these booleans?
    protected boolean isToppingAdded = false;
    protected boolean isCheeseAdded = false;
    protected boolean isBagAdded = false;

    //type of toppings
    HashMap<String, Integer> toppingsType = new HashMap<>();

    //type of cheese
    HashMap<String, Integer> cheeseType = new HashMap<>();

    //constructor
    public Pizza(boolean veg) {
        this.veg = veg;

        //putting in value pairs
        toppingsType.put("Peperoni", 100);
        toppingsType.put("Chicken", 120);
        toppingsType.put("Mushroom", 50);

        //putting in value pairs
        cheeseType.put("Mozzarella", 200);
        cheeseType.put("Cheddar", 150);
        cheeseType.put("Parmesan", 250);
        if (this.veg) {
            this.planePizza = 300;
        } else {
            this.planePizza = 400;
        }

    }


    //METHODS

    // get the key from the hashmap and get the price and add it to the price
    public int addaTopping(String toppingName) {
        this.isToppingAdded = true;
        int toppingPrice = 0;
        if (toppingsType.containsKey(toppingName)) {
            toppingPrice = toppingsType.getOrDefault(toppingName, 0);
//            this.price += toppingPrice;
        }

        return toppingPrice;

    }

    public int addaCheese(String cheeseName) {
        this.isCheeseAdded = true;
        int cheesePrice = 0;
        if (cheeseType.containsKey(cheeseName)) {
            cheesePrice = cheeseType.getOrDefault(cheeseName, 0);
//            this.price += cheesePrice;
        }

        return cheesePrice;
    }

//    //later on i will add more functionality like types of toppings etc
//    public void addToppingsToTotal() {
//        this.isToppingAdded = true;
//        this.price += addToppings;
//    }
//
//    public void addCheeseToTotal() {
//        this.isCheeseAdded = true;
//        this.price += addCheese;
//    }

    public void addTakeAwayBag() {
        this.isBagAdded = true;
        this.price += buyBag;
    }

    //TODO: add new booleans in here other then the ones in the instance variable section
    public void calculatePrice(String typeOfCheese ,String typeOfTopping){

        this.price = this.planePizza;

        //adding the plane pizza price to the total
        String totalBill = "Plane Pizza Price = " + this.planePizza + "\n";

        if(isToppingAdded) {
            int toppingPrice = toppingsType.getOrDefault(typeOfTopping,0);
            this.price += toppingPrice;
             totalBill += "Extra "+typeOfTopping+" Toppings Added = " + toppingPrice + "\n";
        }


        if(isCheeseAdded) {
           int cheesePrice = cheeseType.getOrDefault(typeOfCheese,0);
            this.price += cheesePrice;
            totalBill += "Extra "+typeOfCheese+" Cheese Added = " + cheesePrice + "\n";
        }

        if(isBagAdded) {
            totalBill += "Bag Price Added = " + this.buyBag + "\n";
            this.price += this.buyBag;
        }


        totalBill +="Total Bill = " + this.price + "\n";

        System.out.println(totalBill);
    }
}
