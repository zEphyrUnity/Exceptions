package j_api.seminar3;

// Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:
// Сортирует его по возрастанию и выводит на экран
// Находит минимальное значение в списке и выводит на экран - Minimum is {число}
// Находит максимальное значение в списке и выводит на экран - Maximum is {число}
// Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
// Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
//
// Integer[] arr - список целых чисел
//
// Пример
// arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
// analyzeNumbers(arr)

// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Minimum is 1
// Maximum is 9
// Average is = 5

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class radix_task3 {
    public static void main(String[] args) {
        Integer[] arr = {4, 2, 7, 5, 1, 3, 8, 6, 9};

        analyzeNumbers(arr);
    }

    public static void analyzeNumbers(Integer[] arr) {
        Integer[] someArr = mergeSort(arr);
        print(someArr);
        System.out.println();
        System.out.println("Minimum is " + getMin(arr));
        System.out.println("Maximum is " + getMax(arr));
        System.out.println("Average is =  " + getAverage(arr));
    }

    static int getMax(Integer[] arr) {
        int maxNum = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (arr[i] > maxNum)
                maxNum = arr[i];

        return maxNum;
    }

    static int getMin(Integer[] arr) {
        int minNum = arr[0];

        for (int i = 1; i < arr.length; i++)
            if (arr[i] < minNum)
                minNum = arr[i];

        return minNum;
    }

    static int getAverage(Integer[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum / arr.length;
    }

    public static Integer[] mergeSort(Integer[] a) {
        if (a == null)
            return null;

        if (a.length < 2)
            return a;

        int mid = a.length / 2;

        Integer[] arrayB = new Integer[mid];
        System.arraycopy(a, 0, arrayB, 0, mid);

        Integer[] arrayC = new Integer[a.length - mid];
        System.arraycopy(a, mid, arrayC, 0, a.length - mid);

        arrayB = mergeSort(arrayB);
        arrayC = mergeSort(arrayC);

        return mergeArray(arrayB, arrayC);
    }

    public static Integer[] mergeArray(Integer[] arrA, Integer[] arrayB){
        Integer[] arrayC = new Integer[arrA.length + arrayB.length];

        int positionA = 0;
        int positionB = 0;

        for(int i = 0; i < arrayC.length; i++){
            if(positionA == arrA.length){
                arrayC[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                arrayC[i] = arrA[positionA];
                positionA++;
            } else if (arrA[positionA] < arrayB[positionB]) {
                arrayC[i] = arrA[positionA];
                positionA++;
            } else {
                arrayC[i] = arrayB[positionB];
                positionB++;
            }
        }

        return arrayC;
    }

    static void print(Integer[] arr) {
        List<Integer> someList = new ArrayList<>(Arrays.asList(arr));
        System.out.print(someList);
    }

//    static void countSort(Integer[] arr, int exp) {
//        int[] output = new int[arr.length]; // output array
//
//        int[] count = new int[10];
//        Arrays.fill(count, 0);
//
//        for (int i = 0; i < arr.length; i++)
//            count[(arr[i] / exp) % 10]++;
//
//        for (int i = 1; i < 10; i++)
//            count[i] += count[i - 1];
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
//            count[(arr[i] / exp) % 10]--;
//        }
//
//        for (int i = 0; i < arr.length; i++)
//            arr[i] = output[i];
//    }
//
//    static void radixSort(Integer[] arr) {
//        int m = getMax(arr);
//
//        for (int exp = 1; m / exp > 0; exp *= 10)
//            countSort(arr, exp);
//    }
}
