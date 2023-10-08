package j_api.seminar3;

// Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел a и
// реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.
// Пример
// a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]

public class task1 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 1, 6, -500, 125, -1, 45, 2, 3, -4, 799, 345, -90};

        int[] result = mergeSort(array);

        for(int item: result)
            System.out.print(item + " ");
    }

    public static int[] mergeSort(int[] a) {
        if (a == null)
            return null;

        if (a.length < 2)
            return a;

        int mid = a.length / 2;

        int[] arrayB = new int[mid];
        System.arraycopy(a, 0, arrayB, 0, mid);

        int[] arrayC = new int[a.length - mid];
        System.arraycopy(a, mid, arrayC, 0, a.length - mid);

        arrayB = mergeSort(arrayB);
        arrayC = mergeSort(arrayC);

        return mergeArray(arrayB, arrayC);
    }

    public static int[] mergeArray(int[] arrA, int[] arrayB){
        int[] arrayC = new int[arrA.length + arrayB.length];

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
}
