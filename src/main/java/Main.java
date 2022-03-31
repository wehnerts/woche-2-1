import model.Menu;
import model.OrderSystem;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Menu dish1 = new Menu("FatMaxx", 5.50,"Baconburger", "French Fries", "Root Beer" );
        Menu dish2 = new Menu("FatMed", 3.50,"Burger", "Onion", "Beer" );
        Menu dish3 = new Menu("BigJoe", 12.50,"Baconburger", "Banana Chips", "Coke" );
        Menu dish4 = new Menu("Green Lady", 6.50,"Veggieburger", "Salad", "Green Tea" );
        OrderSystem burgerStore = new OrderSystem();
        burgerStore.addMenu("1", dish1);
        burgerStore.addMenu("2", dish2);
        burgerStore.addMenu("3", dish3);
        burgerStore.addMenu("4", dish4);

        burgerStore.placeOrder();
    }
}
