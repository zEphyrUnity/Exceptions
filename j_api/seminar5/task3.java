package j_api.seminar5;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] array = {5, 8, 12, 3, 6, 9};

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(array));

        HeapSort.heapSort(array, array.length);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}

class HeapSort {

    public static void buildTree(int[] tree, int sortLength) {
        for (int i = sortLength / 2 - 1; i >= 0; i--) {
            heapify(tree, sortLength, i);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        buildTree(sortArray, sortLength);

        for (int i = sortLength - 1; i > 0; i--) {
            int temp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = temp;

            heapify(sortArray, i, 0);
        }
    }

    public static void heapify(int[] tree, int sortLength, int index) {
        int largest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild < sortLength && tree[leftChild] > tree[largest]) {
            largest = leftChild;
        }

        if (rightChild < sortLength && tree[rightChild] > tree[largest]) {
            largest = rightChild;
        }

        if (largest != index) {
            int temp = tree[index];
            tree[index] = tree[largest];
            tree[largest] = temp;

            heapify(tree, sortLength, largest);
        }
    }
}

