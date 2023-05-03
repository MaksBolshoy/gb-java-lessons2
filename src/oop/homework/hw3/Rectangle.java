package oop.homework.hw3;

public class Rectangle extends Figure{//прямоугольник
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double findArea() {
        return sideB*sideA;
    }

    @Override
    public double findPerimeter() {
        return (sideA+sideB)*2;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                "Периметр = "+findPerimeter()+
                "Площадь = "+findArea()+
                '}';
    }
}
