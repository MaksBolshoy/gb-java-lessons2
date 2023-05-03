package oop.homework.hw3;

public abstract class Figure implements Comparable<Figure>{
    abstract double findArea();//метод найти площадь
    abstract  double findPerimeter();// найти периметр
    @Override
    public int compareTo(Figure o) {
        if (this.findArea()>o.findArea()){
            return 1;
        } else if(this.findArea()<o.findArea()){
            return -1;
        }
        return 0;
    }
}
