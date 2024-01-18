//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//creating object of the pizza class to see output
        Pizza Pizza1 = new Pizza(false);
        Pizza1.addToppingsToTotal();
        Pizza1.addCheeseToTotal();
//        Pizza1.calculatePrice();

        //calling the deluxe pizza bill
        deluxePizza dp1 = new deluxePizza(true);
        dp1.calculatePrice();

    }

}
