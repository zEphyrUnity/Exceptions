package oop.toy_shop.View;

import oop.toy_shop.Model.Toy;
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
            System.out.println("1: Создать коробку с игрушками");
            System.out.println("2: Показать игрушки");
            System.out.println("3: Сделать розыгрыш игрушки");
            System.out.println("4. Изменить вес игрушки по id");
            System.out.println("0: Выйти");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Неправильный ввод, введите число.");
                scanner.next();
                continue;
            }

            switch (choice) {
                case 1:
                    toyBoxCreator.createToyBox(scanner, lotteryBasket);
                    break;
                case 2:
                    showToys();
                    break;
                case 3:
                    prizeDraw.prizeWriter(lotteryBasket, path);
                    break;
                case 4:
                    weightChanger.changeWeight(scanner, lotteryBasket);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Неправильный выбор, попробуйте еще раз.");
            }
        }
    }

    @Override
    public void showToys() {
        for(Toy toy: lotteryBasket.getLotteryBasket()){
                System.out.println(toy.getName() + " " + toy.getId() + " " + toy.getWeight());
            }
        }
    }

