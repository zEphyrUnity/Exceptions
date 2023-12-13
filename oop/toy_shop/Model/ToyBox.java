package oop.toy_shop.Model;

import java.util.List;

public class ToyBox {
    private List<Toy> toyBox;

    public ToyBox(List<Toy> toyBox){
        this.toyBox = toyBox;
    }

    public List<Toy> getToyBox() {
        return toyBox;
    }

    public void addToy(String name, int id, int weight) {
        this.toyBox.add(new Toy(name, id, weight));
    }

    public int getMaxWeight() {
        return toyBox.stream().mapToInt(iToy::getWeight).max().orElse(0);
    }
}
