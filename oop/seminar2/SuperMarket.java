package oop.seminar2;

import java.util.ArrayList;
import java.util.List;


public class SuperMarket implements QueueBehaviour, MarketBehaviour {
    private List<Actor> queue;

    public SuperMarket() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println("У нас новый посетитель! Здравствуйте: " + actor.getName());
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue)
            if (!actor.isTakeOrder) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ");
            }
    }

    @Override
    public void giveOrders() {
        for (Actor actor : queue)
            if (actor.isTakeOrder) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " получил заказ");
            }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> actors = new ArrayList<>();

        for(Actor actor: queue)
            if (actor.isTakeOrder) {
                actors.add(actor);
                System.out.println(actor.getName() + " получил вкусный заказ и готов уйти");
            }

        releaseFromMarket(actors);
    }

    @Override

    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor: actors)
            System.out.println(actor.getName() + " довольный вышел из магазина");
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }
}