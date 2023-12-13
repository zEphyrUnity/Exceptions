package oop.toy_shop.Service;

import oop.toy_shop.Model.ToyBox;
import oop.toy_shop.Model.iLotteryBasket;

import java.util.ArrayList;
import java.util.Scanner;

public class ToyBoxCreator implements iToyBoxCreator {

    public void createToyBox(Scanner scanner, iLotteryBasket lotteryBasket) {
        ToyBox toyBox = new ToyBox(new ArrayList<>());
        boolean addMenuStatus = true;
        GetInput getInput = new GetInput();

        scanner.nextLine();
        while (addMenuStatus) {
            System.out.println("1: Добавить игрушку");
            System.out.println("0: Выйти");

            int addMenuChoice = getInput.getInputAsInt(scanner, "", "Неправильный выбор, попробуйте еще раз.");

            switch (addMenuChoice) {
                case 1:
                    String name = getInput.getInputAsString(scanner, "Введите имя: ");
                    int id = getInput.getInputAsInt(scanner, "Введите id: ", "Неправильный id, попробуйте еще раз.");
                    int weight = getInput.getInputAsInt(scanner, "Введите вес: ","Неправильный вес, попробуйте еще раз.");

                    toyBox.addToy(name, id, weight);
                    break;
                case 0:
                    lotteryBasket.getLotteryBasket().addAll(toyBox.getToyBox());
                    addMenuStatus = false;
                    break;
                default:
                    System.out.println("Неправильный выбор, попробуйте еще раз.");
            }
        }
    }
}