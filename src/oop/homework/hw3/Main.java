package oop.homework.hw3;

public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        Triangle triangle = new Triangle(3, 5, 4);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 5);
        Circle circle = new Circle(5.7);
        program.addFigure(triangle);
        program.addFigure(circle);
        program.addFigure(rectangle);
        program.addFigure(square);
        //program.getInfo();
        program.removeFigure(3);
        //program.getInfo();
        program.changeFigure(0,circle);
        program.getInfo();
        System.out.println(program.getAllAreasSum());
        System.out.println(program.getAllPerimetersSum());
    }
}
