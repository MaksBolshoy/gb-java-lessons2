package baza;

import baza.dom1.BubbleSort;

import baza.dom1.StudentSort;
import baza.dom3.MergeSort;
import baza.dom4.Ex004_ArraysMethod;
import baza.dom4.Queue;
import baza.dom4.RemoveEvenNumbers;
import baza.dom4.ReverseLinkedList;
//import baza.dom4.ReverseLinkedList;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {

       // //foo("Maks");
        //System.out.println(foo("Maks"));
        //MergeSort.mergeSort(int[] arr, int n);
        //RemoveEvenNumbers.poin();
        //Ex004_ArraysMethod.bula();
        //ReverseLinkedList.reverseLinkedList();
        //MergeSort.maun();

        Queue queue = new Queue();
        queue.getList().add(2);
        queue.getList().add(5);
        queue.getList().add(7);
        queue.getList().add(1);
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.first());
        queue.enqueue(17);
        System.out.println(queue);
        // MergeSort.usort = new MergeSort();
        // usort.mergeSort();
        //StudentSort.sort();
        //BubbleSort sorter =new BubbleSort();
        //sorter.sort();


    }
     public  static int foo(String arg){
         System.out.println("privet "+arg);
         //StudentSort port = new StudentSort();- создание экземпляра класса
         return 2+2;

     }

}
