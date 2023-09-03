// Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
// Если длинна массива меньше некоторого заданного минимума, метод возвращает -1, в качестве ошибки, иначе длину массива

package seminars;

public class task0 {
    public static void main(String[] args) {
        int[] someArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(CheckLenght(someArray, 10));
        System.out.println(CheckLenght(someArray, 15));
    }

    public static int CheckLenght(int[] array, int maxLength) {
        if (array.length < maxLength)
            return -1;

        return array.length;
    }
}

