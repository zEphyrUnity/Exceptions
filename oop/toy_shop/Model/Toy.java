package oop.toy_shop.Model;

public class Toy implements iToy {
    private final String name;
    private final int id;
    private int weight;

    public Toy(String name, int id, int weight) {
        this.name = name;
        this.id = id;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " " + id + " " + weight;
    }
}
