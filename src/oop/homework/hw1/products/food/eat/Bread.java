package oop.homework.hw1.products.food.eat;

import oop.homework.hw1.products.food.Food;

// хлеб
public class Bread extends Food {
    private String typeOfFlour;

    public Bread(String name, int cost, int quantity, String measure, String date, String type) {
        super(name, cost, quantity, measure, date);
        this.typeOfFlour = type;
    }

    public String getTypeOfFlour() {
        return typeOfFlour;
    }

    public void setTypeOfFlour(String typeOfFlour) {
        this.typeOfFlour = typeOfFlour;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %s; Количество: %s; Еденица измерения: %s; Срок годности: %s; Тип муки: %s;", super.getName(),
                super.getCost(), super.getQuantity(), super.getMeasure(), super.getBestBeforeDate(), this.typeOfFlour);
    }

}

