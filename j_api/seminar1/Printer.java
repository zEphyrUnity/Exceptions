package j_api.seminar1;

public class Printer {
    public static void main(String[] args) {
        String file = "?2 + ?? = 90"; // тут пишем условие, чтение из файла решил не делать

        Equation eq = new Equation();
        String result = eq.getSolution(file);
        System.out.println(result);
    }

    public static class Equation {
        public static String getSolution(String str) {
            // Введите свое решение ниже
            String[] f = str.split(" ");
            int[] a = getArr(f[0]);
            int[] b = getArr(f[2]);
            int[] c = getArr(f[4]);
            int a1 = -1;
            int b1 = -1;
            int c1 = -1;
            boolean eq = false;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    for (int k = 0; k < c.length; k++) {
                        if (a[i] + b[j] == c[k]){
                            a1 = a[i];
                            b1 = b[j];
                            c1 = c[k];
                            eq = true;
                        }

                    }

                }

            }
            System.out.println("Given the equation: " + str);
            String res = eq ? "Result: " + a1 + " + " + b1 + " = " + c1: "No solution";
            return res;
        }

        public static int[] getArr(String str){
            int aCount = ("0" + str + "0").split("\\?").length - 1; // число "?" в строке
            int stop = (int)Math.pow(10, aCount); // максимальное значение замен
            int[] res = new int[stop]; // выходной массив
            char[] newStr = str.toCharArray(); // строку в массив символов
            String iStr = "%0" + str.length() + "d";
            for (int i = 0; i < stop; i++) {
                char[] tempI = String.format(iStr, i).toCharArray(); // создание массива замены с лидирующими нулями
                int tempCounter = str.length() - 1;
                String temp = "";
                for (int j = 0; j < str.length(); j++) {
                    if (newStr[j] == '?'){
                        temp += tempI[tempCounter];
                        tempCounter--;
                    } else {
                        temp += newStr[j];
                    }
                }
                res[i] = Integer.parseInt(temp);
            }
            return res;
        }
    }
}
