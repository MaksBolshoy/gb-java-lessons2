package baza.dom1;
//1.Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
//(через FileWriter).

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class BubbleSort {
    //public static void main(String[] args) throws IOException {
    // int[] numbers = {5, 3, 8, 6, 9, 2, 1, 7, 4};


    public  void sort() throws IOException {
        int[] numbers = {7, 3, 5, 1, 9, 3, 1, 7, 5};

        // записываем исходный массив в лог-файл
        FileWriter writer = new FileWriter("log.txt");
        writer.write("Исходный массив: ");
        for (int num : numbers) {
            writer.write(num + " ");
        }
        writer.write("\n\n");

        boolean wasSwap = true;
        int currentLength = numbers.length - 1;

        while (wasSwap) {
            wasSwap = false;
            for (int i = 0; i < currentLength; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    wasSwap = true;
                }
            }

            // записываем текущее состояние массива в лог-файл
            writer.write("Текущее состояние массива: ");
            for (int num : numbers) {
                writer.write(num + " ");
            }
            writer.write("\n");

            currentLength--; // уменьшаем границу неотсортированной части массива
        }

        writer.close();
        System.out.println(Arrays.toString(numbers));
    }



    public static void printArraeString(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
