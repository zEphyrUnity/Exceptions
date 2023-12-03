package oop.oop_attestation_calculator.View;

import oop.oop_attestation_calculator.Model.*;

public class ConsoleView implements View {
    public void displayMenu() {
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("0. Для выхода");
        System.out.println("Введите номер операции: ");
    }

    @Override
    public void displayResult(Calculator calculator, double a, double b) {
        try {
            double result = calculator.calculate(a, b);

            System.out.println("Результат: " + result);
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void choiceMenu(Calculator calculator, int choice) {
        switch (choice) {
            case 1:
                calculator.setOperation(new Addition());
                break;
            case 2:
                calculator.setOperation(new Subtraction());
                break;
            case 3:
                calculator.setOperation(new Multiplication());
                break;
            case 4:
                calculator.setOperation(new Division());
                break;
            default:
                System.out.println("Неправильная операция");
                break;
        }
    }
}
