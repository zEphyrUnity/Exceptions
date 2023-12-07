package oop.toy_shop;

import oop.toy_shop.Controller.LotteryConsoleController;
import oop.toy_shop.Model.LotteryBasket;
import oop.toy_shop.Model.iLotteryBasket;
import oop.toy_shop.Service.FileWriteService;
import oop.toy_shop.Service.iFileWriter;
import oop.toy_shop.View.ConsoleView;
import oop.toy_shop.Service.ToyBoxCreator;
import oop.toy_shop.Service.iToyBoxCreator;

import java.io.File;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        iLotteryBasket lotteryBasket = new LotteryBasket();
        iFileWriter prizeDraw = new FileWriteService();
        iToyBoxCreator toyBoxCreator = new ToyBoxCreator();
        String path = "oop/toy_shop/ToyStory.txt";

        LotteryConsoleController lottery =
                new LotteryConsoleController(new ConsoleView(lotteryBasket, path, prizeDraw, toyBoxCreator));

        lottery.consoleMenu.displayMenu();

    }
}
