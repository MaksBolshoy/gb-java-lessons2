package oop.homework.hw3;

public class Validator {
    public boolean valid(Figure figure) {
        if (figure instanceof Triangle) {
            Triangle triangle = (Triangle) figure;
            if (triangle.getSideA() + triangle.getSideB() > triangle.getSideC() ||
                    triangle.getSideA() + triangle.getSideC() > triangle.getSideB() ||
                    triangle.getSideB() + triangle.getSideC() > triangle.getSideA()) {
                return true;
            }
            System.out.println("Такой треугольник создать нельзя ");
            return false;
        }
        if(figure instanceof Circle){
            if(((Circle) figure).getRadius()<=0){
                System.out.println("Такой круг создать нельзя ");
                return false;
            }
            return  true;
        }
        if(figure instanceof Rectangle){
            if(((Rectangle) figure).getSideA()<=0 || ((Rectangle) figure).getSideB()<=0){
                System.out.println("Такой прямоугольник  создать нельзя ");
                return false;
            }
            return  true;
        }
        if(figure instanceof Square){
            if(((Square) figure).getSideA()<=0){
                System.out.println("Такой квадрат создать нельзя ");
                return false;
            }
            return  true;
        } //можно свенуть вот так return !(((Square) figure).getSideA() <= 0);
        return true;
    }

}
