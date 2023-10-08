package j_api.seminar3;

// Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел,
// удаляла бы из него четные числа и выводила список без четных чисел.
// Напишите свой код в методе removeEvenNumbers класса Answer.
// Метод removeEvenNumbers принимает на вход один параметр: Integer[] arr - список целых чисел

// Пример
// arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
// removeEvenNumbers(arr);
// [1, 3, 5, 7, 9]
// arr = new Integer[]{2, 4, 6, 8};
// removeEvenNumbers(arr);

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2, 4, 6, 8};
        removeEvenNumbers(arr);
    }

    public static void removeEvenNumbers(Integer[] arr) {
        ArrayList<Integer> onlyOddArray = new ArrayList<>();

        for (Integer item : arr)
            if (item % 2 != 0)
                onlyOddArray.add(item);

        System.out.println(onlyOddArray);
    }
}
