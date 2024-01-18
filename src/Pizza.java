public class Pizza {
//    INSTANCE VARIABLES
    protected int price ;
    protected int planePizza = 300;
    protected boolean veg ;
    protected int addToppings = 150;
    protected int addCheese = 100;
    protected int buyBag = 20;

    //adding variables to check if the other items were added into the base pizza
    protected boolean isToppingAdded = false;
    protected boolean isCheeseAdded = false;
    protected boolean isBagAdded = false;

//constructor
    public Pizza(boolean veg){
        this.veg = veg ;

        if(this.veg){
            this.planePizza = 300;
        }
        else{
            this.planePizza = 400;
        }
    }


    //METHODS


   //later on i will add more functionality like types of toppings etc
    public void addToppingsToTotal(){
        this.isToppingAdded = true;
     this.price += addToppings;
    }

    public void addCheeseToTotal(){
        this.isCheeseAdded = true;
    this.price += addCheese;
    }

    public void addTakeAwayBag(){
        this.isBagAdded = true;
    this.price += buyBag;
    }

    public void calculatePrice(){
        this.price = 0;
        String totalBill = "";

        totalBill = "Plane Pizza Price = " + this.planePizza + "\n" ;
        //adding the plane pizza price to the total
        this.price += this.planePizza;
        if(isToppingAdded) {
            totalBill += "Extra Toppings Added = " + this.addToppings + "\n";
            this.price += this.addToppings;
        }

        if(isCheeseAdded) {
            totalBill += "Extra Cheese Added = " + this.addCheese + "\n";
            this.price += this.addCheese;
        }

        if(isBagAdded) {
            totalBill += "Bag Price Added = " + this.isBagAdded + "\n";
            this.price += this.buyBag;
        }

        totalBill +="Total Bill = " + this.price + "\n";

        System.out.println(totalBill);
    }
}
