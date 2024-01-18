public class deluxePizza extends Pizza {
    public deluxePizza(boolean veg) {
        super(veg);
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


            String totalBill = "";

            totalBill = "Deluxe Pizza Price = " + this.price + "\n" ;

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

