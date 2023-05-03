package oop.homework.hw3;

public class Circle extends Figure {//круг
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI*(radius*radius);
    }

    @Override
    public double findPerimeter() {
        return 2*Math.PI*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "длина окружности  = "+findPerimeter()+
                "Площадь = "+findArea()+
                '}';
    }
}
