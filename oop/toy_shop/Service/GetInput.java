package oop.toy_shop.Service;

import java.util.Scanner;

public class GetInput {
    public int getInputAsInt(Scanner scanner, String prompt, String errorMessage) {
        System.out.print(prompt);
        String inputStr = scanner.nextLine();

        while (!inputStr.matches("\\d+")) {
            System.out.println(errorMessage);
            inputStr = scanner.nextLine();
        }

        return Integer.parseInt(inputStr);
    }

    public String getInputAsString(Scanner scanner, String prompt) {
        System.out.print(prompt);

        return scanner.nextLine();
    }
}
