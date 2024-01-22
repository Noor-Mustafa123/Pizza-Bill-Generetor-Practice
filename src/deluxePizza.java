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
//        methods are already called from the beginning
        super.addaTopping(typeOfTopping);
        super.addaCheese(typeOfCheese);
    }


    @Override
    public void calculatePrice(int quantity) {
        this.price = this.deluxePrice * quantity;

        //adding the plane pizza price to the total
        String totalBill = "Deluxe Pizza Price = " + this.deluxePrice * quantity + "\n";

        if(isToppingAdded) {
            int toppingPrice = toppingsType.getOrDefault(typeOfTopping,0);
            this.price += toppingPrice *quantity;
            totalBill += "Extra "+typeOfTopping+" Toppings Added = " + toppingPrice * quantity + "\n";
        }


        if(isCheeseAdded) {
            int cheesePrice = cheeseType.getOrDefault(typeOfCheese,0);
            this.price += cheesePrice * quantity;
            totalBill += "Extra "+typeOfCheese+" Cheese Added = " + cheesePrice * quantity+ "\n";
        }

        if(isBagAdded) {
            totalBill += "Bag Price Added = " + this.buyBag * quantity + "\n";
            this.price += this.buyBag * quantity;
        }
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

