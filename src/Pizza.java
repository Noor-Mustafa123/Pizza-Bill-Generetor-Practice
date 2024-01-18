public class Pizza {
    private int price ;
    private boolean veg ;

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
    public int addToppings(boolean yes){
        return this.price += 100;
    }

    public int addCheese(boolean yes){
        return this.price += 100;
    }

    public int addTakeAwayBag(boolean yes){
        return this.price += 20;
    }

    public void calculatePrice(){
        System.out.println(this.price);
    }
}
