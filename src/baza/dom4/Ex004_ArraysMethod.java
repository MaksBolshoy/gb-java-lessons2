package baza.dom4;
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
// который вернет “перевернутый” список.
//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый
//элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex004_ArraysMethod {
    public static void bula() {
        List<Integer> list1 = Arrays.asList(15,16,2,4,5,6,8,7,11);
        List<Integer> list2 = new ArrayList<>();
        System.out.println(list1);
        System.out.println(list2);

        for (int item : list1) {
            if (item % 2 != 0){
                list2.add(item);
            }
        }

        System.out.println(list1);
        System.out.println(list2);
    }
}

