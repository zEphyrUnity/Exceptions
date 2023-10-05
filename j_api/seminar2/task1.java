package j_api.seminar2;

//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая
//состоит из чередующихся символов c1 и c2, начиная с c1

public class task1 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String c1 = args[1];
        String c2 = args[2];

        System.out.println(stratch(N, c1, c2));
    }

    protected static String stratch(int N, String c1, String c2) {
        StringBuilder result = new StringBuilder();
        boolean switcher = false;

        for (int i = 0; i < N; i++) {
            if (switcher == false) {
                result.append(c1);
                switcher = true;
            } else {
                result.append(c2);
                switcher = false;
            }
        }

        return result.toString();
    }
}
