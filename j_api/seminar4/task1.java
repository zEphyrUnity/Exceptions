package j_api.seminar4;
import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами.
// Напишите класс LLTasks с методом revert, который принимал бы на вход LinkedList и возвращает “перевернутый” список.
// Пример
// Дан
//        [1, One, 2, Two]
// Вывод
//        [1, One, 2, Two]
//        [Two, 2, One, 1]

public class task1 {
    public static void main(String[] args){
        LinkedList<Object> someLinkedList = new LinkedList<Object>();
        someLinkedList.add(1);
        someLinkedList.add("One");
        someLinkedList.add(2);
        someLinkedList.add("Two");

        revert(someLinkedList);
    }

    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> revertLL = new LinkedList<Object>();

        while(ll.peek() != null){
            revertLL.add(ll.pollLast());
        }

        return revertLL;
    }
}
