package baza.dom4;
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
// который вернет “перевернутый” список.
//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый
//элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class ReverseLinkedList {
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> list) {
        LinkedList<Integer> reversed = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }


}
