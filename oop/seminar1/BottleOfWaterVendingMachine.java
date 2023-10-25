package oop.seminar1;


import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
    List<BottleOfWatter> bottleOfWatters;

    public BottleOfWaterVendingMachine(List<BottleOfWatter> products) {
        this.bottleOfWatters = products;
    }

    public List<BottleOfWatter> getBottleOfWatters() {
        return bottleOfWatters;
    }

    public void setBottleOfWatters(List<BottleOfWatter> bottleOfWatters) {
        this.bottleOfWatters = bottleOfWatters;
    }

    @Override
    public Product getProduct(String name) {
        for (BottleOfWatter item : bottleOfWatters) {
            if(item.getName().equals(name))
                return item;
        }
        return null;
    }
    public Product getProduct(String name, double volume){
        for (BottleOfWatter bottle : bottleOfWatters) {
            if(bottle.getName().equals(name) && bottle.getVolume() == volume)
                return bottle;
        }
        return null;
    }
    public void addBottleOfWater(BottleOfWatter bottleOfWatter){
        this.bottleOfWatters.add(bottleOfWatter);
    }
}
