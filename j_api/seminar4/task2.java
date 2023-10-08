package j_api.seminar4;

import java.util.Deque;
import java.util.LinkedList;

//В классе MyQueue реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди
// dequeue() - возвращает первый элемент из очереди и удаляет его
// first() - возвращает первый элемент из очереди, не удаляя
// getElements() - возвращает все элементы в очереди
// Пример
// queue.enqueue(1);
// queue.enqueue(10);
// queue.enqueue(15);
// queue.enqueue(5);
// System.out.println(queue.getElements());
// [1, 10, 15, 5]
// queue.dequeue();
// queue.dequeue();
// System.out.println(queue.getElements());
// [15, 5]
// System.out.println(queue.first());
// 15

public class task2 {
    public static void main(String[] args){

    }

    class MyQueue<T> {
        LinkedList<T> deque  = new LinkedList<>();

        public void enqueue(T element){
            deque.addLast(element);
        }

        public T dequeue(){
            return deque.pollFirst();
        }

        public T first(){
            return deque.peekFirst();
        }

        public LinkedList<T> getElements() {
            return deque;
        }
    }
}
