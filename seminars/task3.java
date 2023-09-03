// Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента целочисленный одномерный массив
// Метод должен пройтись по каждому элементу и проверить что он не равен null
// А теперь реализуйте следующую логику:
// 1. Если в какой-то ячейке встретился null, то необходимо "оповестить" об этом пользователя.
// 2. Если null встретились в нескольких ячейках, то идеально было бы все их "подсветить"

package seminars;

public class task3 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {

        Integer[] handsomeArray = {1, null, 3, 4, 5, null, 7, 8, null, 10};

        CheckArray(handsomeArray);
    }

    public static String CheckArray(Integer[] array){
        int[] arr = {};
        System.out.println(arr[0]);

        int counter = 0;

        for(int i = 0; i < array.length; i++)
            if(array[i] == null) counter++;

        if(counter == 1){
            throw new RuntimeException("В вашем массиве находится один элемент со значением null");
        }
        else if(counter > 1){
            for(int i = 0; i < array.length; i++){
                if(array[i] == null)
                    System.out.println(ANSI_RED + array[i] + ANSI_RESET);
                else
                    System.out.println(array[i]);
            }
            throw new RuntimeException("\nВ вашем массиве находятся элементы со значением null");
        }
        return "";
    }
}
