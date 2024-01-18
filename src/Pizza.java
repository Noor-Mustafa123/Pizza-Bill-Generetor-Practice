public class Pizza {
    protected int price ;
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
            this.price = 300;
        }
        else{
            this.price = 400;
        }
    }
    //methods


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
    this.price = buyBag;
    }

    public void calculatePrice(){

        String totalBill = "";

        totalBill = "Plane Pizza Price = " + this.price + "\n" ;

        if(isToppingAdded) {
            totalBill += "Extra Toppings Added = " + this.addToppings + "\n";
        }

        if(isCheeseAdded) {
            totalBill += "Extra Cheese Added = " + this.addCheese + "\n";
        }

        if(isBagAdded) {
            totalBill += "Bag Price Added = " + this.isBagAdded + "\n";
        }

        totalBill +="Total Bill = " + this.price;

        System.out.println(totalBill);
    }
}
