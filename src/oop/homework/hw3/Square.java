package oop.homework.hw3;

public class Square extends Figure{
     double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double findArea() {
        return sideA*sideA;
    }

    @Override
    public double findPerimeter() {
        return sideA*4;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                "Периметр = "+findPerimeter()+
                "Площадь = "+findArea()+
                '}';
    }
}
