//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у
//пользователя ввод данных.

package homeworks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw2_task1 {
    public static void main(String[] args){
        System.out.println(printFloat());
    }
    private static float printFloat(){
        Scanner in = new Scanner(System.in);
        float result = 0;
        boolean bool = false;

        System.out.println("Введите дробное число");

        while(!bool) {
            try {
                result = in.nextFloat();
                bool = true;
                in.close();
            } catch (InputMismatchException e) {
                System.out.println("Пожалуйста введите еще раз дробное число пожалуйста, используйте запятую \",\"");
                in.next();
            }
        }

        return result;
    }
}
