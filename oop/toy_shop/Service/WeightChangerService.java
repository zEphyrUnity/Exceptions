package oop.toy_shop.Service;

import oop.toy_shop.Model.Toy;
import oop.toy_shop.Model.iLotteryBasket;

import java.util.Scanner;


public class WeightChangerService implements iWeightChanger {
    GetInput getInput = new GetInput();

    @Override
    public void changeWeight(Scanner scanner, iLotteryBasket lotteryBasket) {
        boolean addMenuStatus = true;

        scanner.nextLine();
        while (addMenuStatus) {
            System.out.println("1: Поиск по id");
            System.out.println("0: Выйти");

            int addMenuChoice = 0;

            if(lotteryBasket.getLotteryBasket().peek() == null)
                System.out.println("Коробка с игрушками пуста");
            else
                addMenuChoice = getInput.getInputAsInt(scanner, "", "Неправильный выбор, попробуйте еще раз!!!.");

            switch (addMenuChoice) {
                case 1:
                    int toyId = getInput.getInputAsInt(scanner, "Введите id: ", "Неверный формат данных");

                    for (Toy toy : lotteryBasket.getLotteryBasket())
                        if (toyId == toy.getId()) {
                            System.out.println("Игрушка " + toy.getId() + " " +
                                    toy.getName() + " " + toy.getWeight() + " найдена");

                            int newWeight = getInput.getInputAsInt(scanner, "Введите вес: ", "Неверный формат данных");
                            toy.setWeight(newWeight);

                            return;
                        }

                    break;
                case 0:
                    addMenuStatus = false;
                    break;
                default:
                    System.out.println("Неправильный выбор, попробуйте еще раз.");
            }
        }
    }
}
