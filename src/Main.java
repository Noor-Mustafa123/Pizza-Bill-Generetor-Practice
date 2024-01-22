//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//creating object of the pizza class to see output
        System.out.println("Order 1");
        Pizza Pizza1 = new Pizza(false);
        Pizza1.addaCheese("Mozzarella");
        Pizza1.addaTopping("Peperoni");
        Pizza1.addTheCoupon(5678);
        Pizza1.calculatePrice(4);
// 2nd object
        System.out.println("Order 2");
        Pizza Pizza2 = new Pizza(true);
        Pizza2.addaCheese("Cheddar");
        Pizza2.addaTopping("Chicken");
        Pizza2.addTheCoupon(1234);
        Pizza2.calculatePrice(2);
//deluxe pizza object
        System.out.println("Order 3");
        deluxePizza dp1 = new deluxePizza(true,"Chicken","Cheddar");
        dp1.addTheCoupon(5678);
        dp1.calculatePrice(1);
        //2nd try
        System.out.println("Order 4");
        dp1.calculatePrice(2);
    }

}
