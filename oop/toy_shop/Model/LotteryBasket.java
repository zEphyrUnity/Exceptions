package oop.toy_shop.Model;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LotteryBasket implements iLotteryBasket {
    private PriorityQueue<Toy> lotteryBasket =
            new PriorityQueue<>(Comparator.comparingInt(Toy::getWeight).reversed());

    public PriorityQueue<Toy> getLotteryBasket() {
        return lotteryBasket;
    }
}
