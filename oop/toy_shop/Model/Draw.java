package oop.toy_shop.Model;

import java.util.PriorityQueue;
import java.util.Random;

public class Draw {
    public Toy prizeDraw(PriorityQueue<Toy> toys) {
        int totalWeight = toys.stream().mapToInt(Toy::getWeight).sum();
        int randomWeight = new Random().nextInt(totalWeight);
        for (Toy toy : toys) {
            randomWeight -= toy.getWeight();
            if (randomWeight < 0) {
                return toy;
            }
        }
        return null;
    }
}
