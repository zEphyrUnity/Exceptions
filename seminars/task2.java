// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
// Необходимо посчитать и вернуть сумму элементов этого массива.
// При это накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк =
// кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1
// Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.


package seminars;

public class task2 {
    public static void main(String[] args) {
        int[][] array =  {{1, 0, 1, 0, 1}, {0, 1, 0, 1, 0}, {1, 0, 1, 0, 1}, {0, 1, 0, 1, 0}, {1, 0, 1, 0, 1}};
        int[][] array1 = {{2, 0, 1, 0, 1}, {0, 1, 0, 1, 0}, {1, 0, 1, 0, 1}, {0, 1, 0, 1, 0}};
        int[][] array2 = {{1, 0, 1, 0, 1}, {0, 1, 0, 1, 0}, {1, 0, 1, 0, 1}, {0, 1, 0, 1, 0}};

        System.out.println(GetBinaryMatrixSum((array)));
    }

    public static int GetBinaryMatrixSum(int[][] matrix){
        int summ = 0;

        if(matrix.length == matrix[0].length)
            throw new RuntimeException("Это не матрица " + matrix.length + " x " + matrix[0].length);

        for(int[] row: matrix)
            for(int item: row){
                if(item != 0 & item != 1)
                    throw new RuntimeException("Это не бинарная матрица, содержит значение - " + item);
                summ += item;
            }

        return summ;
    }
}
