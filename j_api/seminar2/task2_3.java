package j_api.seminar2;

// Напишите метод, который сжимает строку.
// Пример: вход aaaabbbcdd.


import java.util.Arrays;
import java.util.LinkedHashSet;

public class task2_3 {
    public static void main(String[] args) {
        String data = "xaabbbcddaaabbbcbbaadd";

        System.out.println(compressMethodOne(data));
        System.out.println(compressMethodTwo(data));
        System.out.println(compressMethodCount(data));
    }


    protected static String compressMethodOne(String data) {
        StringBuilder result = new StringBuilder();
        char[] dataCharArray = data.toCharArray();
        Arrays.sort(dataCharArray);
        String sortedData = String.valueOf(dataCharArray);

        for (int i = 1; i < sortedData.length(); i++) {
            if (sortedData.charAt(i) != sortedData.charAt(i - 1)) {
                result.append(sortedData.charAt(i - 1));
            }
        }
        result.append(sortedData.charAt(sortedData.length() - 1));

        return result.toString();
    }

    protected static String compressMethodTwo(String data) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < data.length(); i++) {
            set.add(data.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }

        return result.toString();
    }

    protected static String compressMethodCount(String data) {
        StringBuilder result = new StringBuilder();
        char[] dataCharArray = data.toCharArray();

        Arrays.sort(dataCharArray);
        String sortedData = String.valueOf(dataCharArray);

        int count = 1;
        for (int i = 1; i < sortedData.length(); i++) {
            if (sortedData.charAt(i) == sortedData.charAt(i - 1)) {
                count++;
            } else {
                result.append(sortedData.charAt(i - 1));
                result.append(count);
                count = 1;
            }
        }

        result.append(sortedData.charAt(sortedData.length() - 1));
        result.append(count);

        return result.toString();
    }
}
