package oop.seminar2;

public class Main {
    public static void main(String[] args) {
        SuperMarket market = new SuperMarket();
        Human human1 = new Human("Ivan");
        Human human2 = new Human("Vladimir");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();
    }
}
