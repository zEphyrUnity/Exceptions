package oop.toy_shop;

import oop.toy_shop.Controller.LotteryConsoleController;
import oop.toy_shop.Model.LotteryBasket;
import oop.toy_shop.Model.Draw;
import oop.toy_shop.Model.Toy;
import oop.toy_shop.Model.iLotteryBasket;
import oop.toy_shop.Service.FileWriteService;
import oop.toy_shop.Service.iFileWriter;
import oop.toy_shop.View.ConsoleView;
import oop.toy_shop.Service.ToyBoxCreator;
import oop.toy_shop.Service.iToyBoxCreator;


public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy("Сега", 1, 7);
        Toy toy2 = new Toy("Супер нинтендо", 2, 5);
        Toy toy3 = new Toy("Сони плэйстэйшн", 3, 2);

        iLotteryBasket lotteryBasket = new LotteryBasket();
        lotteryBasket.getLotteryBasket().add(toy1);
        lotteryBasket.getLotteryBasket().add(toy2);
        lotteryBasket.getLotteryBasket().add(toy3);

//        Draw draw = new Draw();
//        for(int i = 0; i < 10; i++)
//            System.out.println(draw.prizeDraw(lotteryBasket.getLotteryBasket()));

        iFileWriter drawResultWriter = new FileWriteService();
        iToyBoxCreator toyBoxCreator = new ToyBoxCreator();
        String path = "oop/toy_shop/ToyStory.txt";

        LotteryConsoleController lottery =
                new LotteryConsoleController(new ConsoleView(lotteryBasket, path, drawResultWriter, toyBoxCreator));

        lottery.consoleMenu.displayMenu();
    }
}
