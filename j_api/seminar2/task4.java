package j_api.seminar2;

// Вам дается строка S и целочисленный массив индексов int
// index[s.length]. Напишите программу, которая перетасует
// символы в S таким образом, что символ c i-й позиции
// переместится на индекс index[i] в результирующей строке.
// Пример: s = “cba”, index = [3,2,1]
// Результат “abc”


public class task4 {
    public static void main(String[] args) {
        String s = "abcd";
        int[] index = {3, 1, 4, 2};
        String result = reshuffleString(s, index);
        System.out.println(result);
    }

    public static String reshuffleString(String s, int[] index) {
        char[] shuffled = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            shuffled[index[i] - 1] = s.charAt(i);
        }

        return new String(shuffled);
    }
}
