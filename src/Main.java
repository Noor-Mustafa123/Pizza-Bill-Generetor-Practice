//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//creating object of the pizza class to see output
        Pizza Pizza1 = new Pizza(false);
        Pizza1.addaCheese("Mozzarella");
        Pizza1.addaTopping("Peperoni");
        Pizza1.calculatePrice("Mozzarella","Peperoni");
        Pizza1.calculatePrice("Cheddar","Chicken");
// 2nd object
        Pizza Pizza2 = new Pizza(true);
        Pizza2.addaCheese("Cheddar");
        Pizza2.addaTopping("Chicken");
        Pizza2.calculatePrice("Cheddar","Chicken");
        Pizza2.calculatePrice("Cheddar","Chicken");
//deluxe pizza object
        deluxePizza dp1 = new deluxePizza(true,"Chicken","Cheddar");
        dp1.calculatePrice();
        //2nd try
        dp1.calculatePrice();
    }

}
