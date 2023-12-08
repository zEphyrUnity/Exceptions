package oop.toy_shop.Model;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LotteryBasket implements iLotteryBasket {
    private PriorityQueue<Toy> lotteryBasket =
            new PriorityQueue<>(Comparator.comparingInt(Toy::getWeight).reversed());

    public PriorityQueue<Toy> getLotteryBasket() {
        return lotteryBasket;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        for (Toy toy : getLotteryBasket()) {
            sb.append(toy.getName()).append(" ")
                    .append(toy.getId()).append(" ")
                    .append(toy.getWeight()).append("\n");
        }

        return sb.toString();
    }
}
