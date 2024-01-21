public class deluxePizza extends Pizza {
    protected int deluxePrice;
    protected String typeOfTopping;
    protected String typeOfCheese;
    public deluxePizza(boolean veg,String typeOfTopping,String typeOfCheese) {
        super(veg);
        this.typeOfTopping = typeOfTopping;
        this.typeOfCheese = typeOfCheese;

        if(this.veg){
            this.deluxePrice = 500;
        }
        else{
            this.deluxePrice = 800;
        }
        super.addaTopping(typeOfTopping);
        super.addaCheese(typeOfCheese);
    }




    public void calculatePrice() {

        this.price = this.deluxePrice;

        //adding the plane pizza price to the total
        String totalBill = "Deluxe Pizza Price = " + this.deluxePrice + "\n";

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

