// Задание 2
//        try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }

package j_exceptions.homeworks;

public class hw2_task2 {
    public static void main(String[] args){
        double catchedRes1 = 0;

        try {
            int zero = 0;
            int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            catchedRes1 = (double) intArray[8] / zero;

            if(catchedRes1 == Double.POSITIVE_INFINITY)
                throw new ArithmeticException();

            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e + "\ncatchedRes1 = " + catchedRes1);
        }
    }
}
