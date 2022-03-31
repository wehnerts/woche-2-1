package model;

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class OrderSystem {
    private final static HashMap<String, Menu> menus = new HashMap<>();
    //Nutzt Standardkonstruktor, da keine Werte beim Start übergeben werden.

    public void addMenu(String id, Menu menu){
        menus.put(id, menu);
    }

    public Menu getOrderById(String id) {
        //Wenn es die ID gibt, gib sie aus , andernfalls wirf Ausnahme
        if (menus.containsKey(id)) {
            return menus.get(id);
        }else {
            throw new NoSuchElementException("Bitte prüfen Sie ihre Auswahl!");
        }

    }
    public String toString(){
        String menuString = "";
        for (String key : menus.keySet()){
            menuString += "\n" + "["+ key +"] " + menus.get(key).toString();
        }
        return menuString;
    }

    public void placeOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte wählen Sie ein Menü"+ this);//Objekt ist burgerstore(this) Ausgabe to String

        try{
            String choice = scanner.nextLine();
            Menu chosenMenu = getOrderById(choice);

            System.out.println("\n Du hast gewählt: \n");
            System.out.println(chosenMenu + "\n");
            System.out.println("Das macht "+chosenMenu.getPrice()+" bitte");
        }catch(Exception e){
            System.out.println(e.getMessage());
            placeOrder();
        }

        }
    }
        //Get all menus
        //MAP all menus
        //Place Order



