package oop.oop_attestation_calculator.Controler;

import oop.oop_attestation_calculator.Model.*;
import oop.oop_attestation_calculator.View.View;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleExecuteController implements  ExecuteController{
    private final Calculator calculator;
    private final Scanner scanner = new Scanner(System.in);
    private final View view;

    public ConsoleExecuteController(Calculator calculator, View view){
        this.calculator = calculator;
        this.view = view;
    }

    public void execute() {
        while (true) {
            view.displayMenu();

            int choice;
            try {
                choice = scanner.nextInt();

                if(choice == 0)
                    return;

                if (choice < 0 || choice > calculator.getMenuOperationsQuantity()) {
                    System.out.println("Неправильная операция");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Неправильный ввод, введите число.");
                scanner.next();
                continue;
            }

            System.out.print("Введите первое число: ");
            double a;

            try {
                a = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Неправильный ввод, введите число.");
                scanner.next();
                continue;
            }

            System.out.print("Введите второе число: ");
            double b;
            try {
                b = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Неправильный ввод, введите число.");
                scanner.next();
                continue;
            }

            view.choiceMenu(calculator, choice);
            view.displayResult(calculator, a, b);
        }
    }
}
