//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package j_exceptions.homeworks;

import java.util.Scanner;

public class hw2_task4 {
    public static void main(String[] args) throws Exception {
        printUserText();
    }

    public static void printUserText() throws Exception {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        if(input.isEmpty()){
            throw new Exception("Пустые строки вводить нельзя!");
        }else{
            System.out.println("Вы ввели: " + input);
        }
    }
}
