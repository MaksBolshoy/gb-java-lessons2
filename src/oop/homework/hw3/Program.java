package oop.homework.hw3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Program {
    private  final Validator validator = new Validator();
    private final List<Figure> allFigures = new ArrayList<>(); // список фигур пустой

    public void addFigure(Figure figure) {// добавить фигуру в список фигурес
        //if(validator.valid(figure)){
            allFigures.add(figure);
       // }
        //throw new RuntimeException("Такая фигура не существует ");
    }
    public void removeFigure(int index){// удалить фигуру по индексу;списка
        allFigures.remove(index);
    }
    public void changeFigure(int index,Figure figure){ // изменить фигуру по индексу списка
        //if(validator.valid(figure)){
            removeFigure(index);
            addFigure(figure);
        //}
        //throw new RuntimeException("Такая фигура не существует ");
    }
    public void sort(){
        Collections.sort(allFigures);
    }
    public double getAllPerimetersSum() { // сумма всех периметров фигур в списке
        double count = 0;
        for (Figure figure : allFigures) {
            count += figure.findPerimeter();
        }
        return count;
    }

    public double getAllAreasSum() { // сумма всех площадей
        double count = 0;
        for (Figure figure : allFigures) {
            count += figure.findArea();
        }
        return count;
    }

    public void getInfo() {
        for (Figure figure : allFigures){
            System.out.println(figure);
        }
    }
}
