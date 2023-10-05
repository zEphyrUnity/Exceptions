package j_exceptions.lections;

import java.io.FileReader;
import java.io.IOException;

public class lection2 {
    public static void main(String[] args){
//        java.lang.NullPointerException
//        String some_string = null;
//        System.out.println(some_string.length());

//        java.lang.ClassCastException
//        Object obj = new String("123");
//        File file = (File) obj;
//        System.out.println(file);

//        java.lang.NumberFormatException
//        String number = "1234qwer";
//        int result = Integer.parseInt(number);
//        System.out.println(result);

//        java.lang.UnsupportedOperationException
//        List<Object> emptyList = Collections.emptyList();
//        emptyList.add(new Object());

//        String test = null;
//        int number = 1;
//
//        try {
//            number = 10 / 0;
//            System.out.println(test.length());
//            Collections.emptyList().add(new Object());
//        } catch (ArithmeticException | NullPointerException e){
//            System.out.println("Exception " + e + " " + e.getClass().getSimpleName());
//        } catch (Exception e){
//            System.out.println("Exception " + e.getClass().getSimpleName());
//        }

        FileReader test = null;
        try {
            test = new FileReader("C:\\Users\\zEphyr\\Git\\Exception_handling\\Exception_handling_tasks\\src\\task3.java");
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        } finally {
            System.out.println("Finaly Start");
            if (test != null){
                try {
                    test.close();
                } catch (IOException e) {
                    System.out.println("Exception while close");
                }
            }
            System.out.println("Finaly Stop");
        }
    }
}
