package oop.toy_shop.View;

import oop.toy_shop.Model.Draw;
import oop.toy_shop.Model.iLotteryBasket;
import oop.toy_shop.Service.WeightChangerService;
import oop.toy_shop.Service.iFileWriter;
import oop.toy_shop.Service.iToyBoxCreator;
import oop.toy_shop.Service.iWeightChanger;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ConsoleView implements iView {
    iLotteryBasket lotteryBasket;
    String path;
    iFileWriter prizeDraw;
    iToyBoxCreator toyBoxCreator;
    iWeightChanger weightChanger = new WeightChangerService();
    Draw draw = new Draw();

    enum Action {
        EXIT,
        CREATE_TOY_BOX,
        SHOW_TOYS,
        MAKE_PRIZE_DRAW,
        CHANGE_TOY_WEIGHT,
    }

    public ConsoleView(iLotteryBasket lotteryBasket, String path, iFileWriter prizeDraw, iToyBoxCreator toyBoxCreator) {
        this.lotteryBasket = lotteryBasket;
        this.path = path;
        this.prizeDraw = prizeDraw;
        this.toyBoxCreator = toyBoxCreator;
    }

    @Override
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            displayMenuOptions();

            Action choice = getUserChoice(scanner);

            switch (choice) {
                case CREATE_TOY_BOX:
                    toyBoxCreator.createToyBox(scanner, lotteryBasket);
                    break;
                case SHOW_TOYS:
                    showToys();
                    break;
                case MAKE_PRIZE_DRAW:
                    prizeDraw.prizeWriter(lotteryBasket, path, draw);
                    break;
                case CHANGE_TOY_WEIGHT:
                    weightChanger.changeWeight(scanner, lotteryBasket);
                    break;
                case EXIT:
                    return;
                default:
                    System.out.println("Неправильный выбор, попробуйте еще раз.");
            }
        }
    }

    private void displayMenuOptions() {
        System.out.println("1: Создать коробку с игрушками");
        System.out.println("2: Показать игрушки");
        System.out.println("3: Сделать розыгрыш игрушки");
        System.out.println("4. Изменить вес игрушки по id");
        System.out.println("0: Выйти");
    }


    private Action getUserChoice(Scanner scanner) {
        while (true) {
            try {
                int choice = scanner.nextInt();
                return Action.values()[choice];
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Неправильный ввод, введите число.");
                scanner.next();
            }
        }
    }

    @Override
    public void showToys() {
        System.out.println(lotteryBasket.toString());
    }
}

