package oop.homework.hw1.products.food.drink;

import oop.homework.hw1.products.food.Food;

// напитки
public class Drink extends Food {
    private double volume;

    public Drink(String name, double cost, double quantity, String measure, String bestBeforeDate, double volume) {
        super(name, cost, quantity, measure, bestBeforeDate);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "volume=" + volume +
                ", bestBeforeDate='" + bestBeforeDate + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", measure='" + measure + '\'' +
                '}';
    }
}


