package oop.homework.hw3;

public class Triangle extends Figure{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    private double getHalfPerimeter(){
        return (sideA+sideB+sideC)/2;
    }
    @Override
    public double findArea() {
        double halfPerimeter=getHalfPerimeter();
        return Math.sqrt((halfPerimeter*(halfPerimeter-sideA)*(halfPerimeter-sideB)*(halfPerimeter-sideC)));
    } //треугольник

    @Override
    public double findPerimeter() {
        return sideA+sideB+sideC;
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

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                "Периметр = "+findPerimeter()+
                "Площадь = "+findArea()+
                '}';
    }


}
