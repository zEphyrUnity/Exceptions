package j_api.seminar4;

// В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
// Отмена последней операции должна быть реализована следующим образом:
// если передан оператор '<' калькулятор должен вывести результат предпоследней операции.

// calculate('+', 3, 7)
// calculate('+', 4, 7)
// calculate('<', 0, 0)
// 10
// 11
// 10

//calculate('*', 3, 2)
//calculate('-', 7, 4)
//calculate('<', 0, 0)
// 6
// 3
// 6

import java.util.LinkedList;

public class task3 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.calculate('+', 3, 7));
        System.out.println(calc.calculate('+', 4, 7));
        System.out.println(calc.calculate('<', 0, 0));

        System.out.println(calc.calculate('*', 3, 2));
        System.out.println(calc.calculate('-', 7, 4));
        System.out.println(calc.calculate('<', 0, 0));
    }

    static class Calculator {
        LinkedList<Integer> someLL = new LinkedList<Integer>();

        public int calculate(char op, int a, int b) {
            switch (op) {
                case '+':
                    someLL.addLast(a + b);
                    break;
                case '-':
                    someLL.addLast(a - b);
                    break;
                case '/':
                    someLL.addLast(a / b);
                    break;
                case '*':
                    someLL.addLast(a * b);
                    break;
                case '<':
                    someLL.removeLast();
                    break;
            }

            if (someLL.peekLast() != null)
                return someLL.peekLast();
            else
                return 0;
        }
    }
}
