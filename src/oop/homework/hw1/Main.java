package oop.homework.hw1.products;


/*
+1 Создаем клас продукты
+2 Создаем клас программ
+3 Создаем клас хлеб
+4 создаем клас майн


*/

import oop.homework.hw1.products.food.eat.Bread;
import oop.homework.hw1.products.food.drink.Drink;

public class Main {
    public static void main(String[] args) {
       // Product milk = new Product("Milk", 1, 1.5, "liter");

        Bread bread = new Bread("Бородинский", 25,1, "Булка", "до 23 12 23 ", "формовой");
        // System.out.println(bread);
        //bread.setCost(5);
        //System.out.println(bread);
        //Product bread = new Product("Bread", 2, 0.5, "thing");
        Drink  drink = new Drink("Cola", 12, 1, "Liter", "1",1.5);
        drink.getName();
        System.out.println(Program.getInfo(bread));
        System.out.println(Program.getInfo(drink));
    }

}
