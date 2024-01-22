import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {
    //    INSTANCE VARIABLES
    protected int price;
    protected int planePizza;
    protected boolean veg;
    protected int couponNumber;
    protected int buyBag = 20;
    protected String toppingName;
    protected String cheeseName;

    //adding variables to check if the other items were added into the base pizza
    //TODO: see why you created these booleans?
    protected boolean isToppingAdded = false;
    protected boolean isCheeseAdded = false;
    protected boolean isBagAdded = false;

    //type of toppings
    HashMap<String, Integer> toppingsType = new HashMap<>();

    //type of cheese
    HashMap<String, Integer> cheeseType = new HashMap<>();

    //Coupon Code
    HashMap<Integer, Integer> coupons = new HashMap<>();

    //constructor
    public Pizza(boolean veg) {
        this.veg = veg;

        //putting in value pairs in toppings Hashmap
        toppingsType.put("Peperoni", 100);
        toppingsType.put("Chicken", 120);
        toppingsType.put("Mushroom", 50);

        //putting in value pairs in cheese HashMap
        cheeseType.put("Mozzarella", 200);
        cheeseType.put("Cheddar", 150);
        cheeseType.put("Parmesan", 250);

        // putting value pairs in coupon HashMap
        coupons.put(1234,20);
        coupons.put(5678,30);
        coupons.put(9101,40);

        if (this.veg) {
            this.planePizza = 300;
        } else {
            this.planePizza = 400;
        }

    }


    //METHODS

    // get the key from the hashmap and get the price and add it to the price
    public int addaTopping(String toppingName) {
        this.toppingName = toppingName;
        this.isToppingAdded = true;
        int toppingPrice = 0;
        if (toppingsType.containsKey(toppingName)) {
            toppingPrice = toppingsType.getOrDefault(toppingName, 0);
        }

        return toppingPrice;

    }

    public int addaCheese(String cheeseName) {
        this.cheeseName = cheeseName;
        this.isCheeseAdded = true;
        int cheesePrice = 0;
        if (cheeseType.containsKey(cheeseName)) {
            cheesePrice = cheeseType.getOrDefault(cheeseName, 0);
        }

        return cheesePrice;
    }

    //method to get the value of the discount coupon
    public int addTheCoupon(int couponNumber) {
        this.couponNumber = couponNumber;
       int discountPercentage;
      discountPercentage = coupons.getOrDefault(couponNumber, 0);
        return discountPercentage;
    }

    public void addTakeAwayBag() {
        this.isBagAdded = true;
        this.price += buyBag;
    }
    public void calculatePrice(int quantity){
    // this is added to reset the price to base as well as adding the plane pizza price into the total at the same time
        this.price = this.planePizza * quantity;

        //adding the plane pizza price to the total
        String totalBill = "Plane Pizza Price = " + this.planePizza * quantity + "\n";

        if(isToppingAdded) {
            int toppingPrice = toppingsType.getOrDefault(toppingName,0);
            this.price += toppingPrice * quantity;
             totalBill += "Extra "+toppingName+" Toppings Added = " + toppingPrice * quantity + "\n";
        }


        if(isCheeseAdded) {
           int cheesePrice = cheeseType.getOrDefault(cheeseName,0);
            this.price += cheesePrice * quantity;
            totalBill += "Extra "+cheeseName+" Cheese Added = " + cheesePrice * quantity + "\n";
        }

        if(isBagAdded) {
            totalBill += "Bag Price Added = " + this.buyBag * quantity + "\n";
            this.price += this.buyBag * quantity;
        }
        //TODO: first set the hashmap that has two value pairs a coupon code and its discount value then add
        // the value here to the total price

//        Discount functionality
        int discountPercentage = addTheCoupon(couponNumber);
        if(quantity>1) {
            int discountValue = (discountPercentage * this.price) / 100;
            System.out.println("discount = " + discountPercentage +"%");
            System.out.println("discount value = " + discountValue);
            //applying the discount to the total price not per pizza so remove the * quantity
            this.price -= discountValue ;
        }
        else{
            System.out.println("Discounts are available only for the purchase of more then one pizza!");
        }

        totalBill +="Total Bill = " + this.price + "\n";

        System.out.println(totalBill);
    }
}
















