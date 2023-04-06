package baza.dom4;

import java.util.LinkedList;

public  class Queue {
    private LinkedList<Integer> list;

    public Queue() {
        list = new LinkedList<>();
    }

    public void enqueue(Integer element) {
        list.add(element);
    }

    public Object dequeue() {
        return list.removeFirst();
    }

    public Object first() {
        return list.getFirst();
    }

    public LinkedList<Integer> getList() {
        return list;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Integer item:list){
            builder.append(item).append(", ");
        }
        return builder.toString();
    }
}
