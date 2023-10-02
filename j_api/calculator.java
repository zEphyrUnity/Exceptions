package j_api;

public class calculator {
    public static void main(String[] args){
        System.out.println(calculate('&', 10, 2));
    }

    public static int calculate(char op, int a, int b) {
        String regex = "^[+/*-]";
        String cahrToString = String.valueOf(op);

        String warning_op = String.format("Некорректный оператор: %c", op);
        if(!cahrToString.matches(regex)){
            System.out.println(warning_op);
        }

        int result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
        }

        return result;
    }
}


//    public static int calculate(char op, int a, int b) throws RuntimeException{
//        String regex = "^[+/*-]";
//        String cahrToString = String.valueOf(op);
//        int result = 0;
//
//        try {
//            if (!cahrToString.matches(regex)) {
//                throw new RuntimeException("Некорректный оператор: 'оператор'");
//            }
//
//            switch (op) {
//                case '+':
//                    result = a + b;
//                    break;
//                case '-':
//                    result = a - b;
//                    break;
//                case '*':
//                    result = a * b;
//                    break;
//                case '/':
//                    result = a / b;
//            }
//
//        } catch (RuntimeException ex){
//            System.out.println(ex);
//        }
//
//        return result;
//    }