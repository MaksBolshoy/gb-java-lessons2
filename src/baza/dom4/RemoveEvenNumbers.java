package baza.dom4;
//Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
// который вернет “перевернутый” список.
//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый
//элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class RemoveEvenNumbers {
    public static void poin() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        // Используем поток (stream()) для фильтрации нечетных чисел
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .toList();

        System.out.println(oddNumbers); // Выводим результат
    }
}

