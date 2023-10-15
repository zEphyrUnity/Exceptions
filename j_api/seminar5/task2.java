package j_api.seminar5;

// Подсчет повторяющихся имен
// Вы работаете с приложением для учета имен пользователей. Ваша задача - разработать программу, которая принимает на вход пять имен пользователей (или использует имена по умолчанию, если аргументы не предоставлены) и подсчитывает, сколько раз каждое имя встречается.
// Программа должна использовать HashMap для хранения имен и их количества вхождений.
// По завершении, программа выводит результат в виде пар "имя - количество".
// На входе:
// 'Elena'
// 'Elena'
// 'Elena'
// 'Ivan'
// 'Ivan'
// На выходе:
// {Ivan=2, Elena=3}

import java.util.HashMap;

public class task2 {
    public static void main(String[] args) {
        String name1 = "Elena";
        String name2 = "Elena";
        String name3 = "Elena";
        String name4 = "Ivan";
        String name5 = "Ivan";

        NamesCounter namesCounter = new NamesCounter();

        namesCounter.addName(name1);
        namesCounter.addName(name2);
        namesCounter.addName(name3);
        namesCounter.addName(name4);
        namesCounter.addName(name5);

        namesCounter.showNamesOccurrences();
    }
}

class NamesCounter {
    private HashMap<String, Integer> names = new HashMap<>();

    public void addName(String name) {
        if (names.containsKey(name)) {
            names.put(name, names.get(name) + 1);
        } else {
            names.put(name, 1);
        }
    }

    public void showNamesOccurrences() {
        System.out.println(names);
    }
}
