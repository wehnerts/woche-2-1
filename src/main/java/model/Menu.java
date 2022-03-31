package model;

import java.util.Objects;

public class Menu {
    private String name;
    private double price;
    private String mainDish;
    private String sideDish;
    private String beverage;
    //Constructor
    public Menu(String name, double price, String mainDish, String sideDish, String beverage){
        this.name = name;
        this.price = price;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.beverage = beverage;
    }

    @Override
    public String toString() {
        return  name +
                ": " + mainDish +
                " & " + sideDish +
                " & " + beverage+
                " > " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Menu menu = (Menu) o;

        return (Double.compare(menu.getPrice(), getPrice()) == 0) &&
                (Objects.equals(getName(), menu.getName())) &&
                (Objects.equals(getMainDish(), menu.getMainDish())) &&
                (Objects.equals(getSideDish(), menu.getSideDish())) &&
                (Objects.equals(getBeverage(), menu.getBeverage()));
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (mainDish != null ? mainDish.hashCode() : 0);
        result = 31 * result + (sideDish != null ? sideDish.hashCode() : 0);
        result = 31 * result + (beverage != null ? beverage.hashCode() : 0);
        return result;
    }

    //Getter/Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMainDish() {
        return mainDish;
    }

    public void setMainDish(String mainDish) {
        this.mainDish = mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public void setSideDish(String sideDish) {
        this.sideDish = sideDish;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }


}
