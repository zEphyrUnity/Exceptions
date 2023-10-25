package oop.seminar1;

import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    private List<HotDrink> hotDrinks;

    public HotDrinksVendingMachine(List<HotDrink> products) {
        this.hotDrinks = products;
    }

    public List<HotDrink> getHotDrinks(){
        return hotDrinks;
    }

    public void setHotDrinks(List<HotDrink> hotDrinks){
        this.hotDrinks = hotDrinks;
    }

    @Override
    public Product getProduct(String name) {
        for (HotDrink item : hotDrinks)
            if (item.getName().equals(name))
                return item;

        return null;
    }

    @Override
    public Product getProduct(String name, double volume) {
        for (HotDrink item : hotDrinks)
            if (item.getName().equals(name) && item.getVolume() == volume)
                return item;

        return null;
    }

    public Product getProduct(String name, double volume, int temperature) {
        for(HotDrink item : hotDrinks)
            if(item.getName().equals(name) && item.getVolume() == volume && item.getTemperature() == temperature)
                return item;

        return  null;
    }

    public void addHotDrink(HotDrink hotDrink){
        this.hotDrinks.add(hotDrink);
    }
}