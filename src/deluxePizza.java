public class deluxePizza extends Pizza {
    protected int deluxePrice = 500;
    public deluxePizza(boolean veg) {
        super(veg);
        if(this.veg){
            this.deluxePrice = 500;
        }
        else{
            this.deluxePrice = 800;
        }
        super.addCheeseToTotal();
        super.addToppingsToTotal();
    }
    //overwrite methods so that duplicate cheesee and toppings are not added into the bill

    @Override
    public void addToppingsToTotal() {
        //keeping the methods empty to stop duplicate

    }

    @Override
    public void addCheeseToTotal() {
        //keeping the methods empty to stop duplicate
    }

    @Override
    public void calculatePrice() {

        this.price = 0;

            String totalBill = "";

            totalBill = "Deluxe Pizza Price = " + this.deluxePrice + "\n" ;
            //adding the deluxe price to the total
            this.price += this.deluxePrice;

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

