// Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. Метод ищет в массиве
// заданное значение и возвращает его индекс. При этом, например:

// 1 если длинна массива меньше некоторого заданного минимума, метод возвращает -1, в качестве ошибки.
// 2 если искомый елемент не найден, метод вернет -2 в качестве кода ошибки.
// 3 если вместо массива пришел null, метод вернет -3
// 4 придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.

// Напишите метод, в котором реализуйте взаимодействие с пользователями. Те есть, этот метод запросит искомое число у
// пользователя, вызовет первый, обработает возвращенное значение и покажет читаемый результат пользователю. Например,
// если вернулся -2, пользователю выведется сообщение: "Искомый элемент не найден".

package seminars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    public static void main(String[] args) throws IOException {
        int[] someArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nullArray = null;

        System.out.print("Введите число: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String userString = br.readLine();
        int userValue = Integer.parseInt(userString);

        System.out.println(UserUI(someArray, userValue, 10));
    }

    public static int FindPosition(int[] array, int value, int length)
    {
        int minLength = 5;
        int maxLength = 15;

        if(array == null){
            return -3;
        }

        if(length < minLength){
            return -1;
        }

        if(length > maxLength){
            return -4;
        }

        for(int i = 0; i < array.length; i++){
            if(value == array[i]){
                return i;
            }
        }

        return -2;
    }

    public static String UserUI(int[] array, int value, int length) {

        if(FindPosition(array, value, length) == -3){
            return "Массив пустой, обратитесь в службу поддержки";
        }

        if(FindPosition(array, value, length) == -1){
            return "Массив данных слишком маленький, обратитесь в службу поддержки";
        }

        if(FindPosition(array, value, length) == -4){
            return "Массив данных слишком большой, обратитесь в службу поддержки";
        }

        if(FindPosition(array, value, length) == -2){
            return "Искомый элемент не найден, наберешь geroj";
        }

        return "Индекс введенного вами значения: " + FindPosition(array, value, length);

    }
}
