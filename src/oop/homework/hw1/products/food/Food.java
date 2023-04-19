package oop.homework.hw1.products.food;

import oop.homework.hw1.products.Product;

// продукты питания
public class Food extends Product {
    protected String bestBeforeDate;

    public Food(String name, double cost, double quantity, String measure, String bestBeforeDate) {
        super(name, cost, quantity, measure);
        this.bestBeforeDate = bestBeforeDate;
    }

    public String getBestBeforeDate() {
        return bestBeforeDate;
    }

    public void setBestBeforeDate(String bestBeforeDate) {
        this.bestBeforeDate = bestBeforeDate;
    }

    @Override
    public String toString() {
        return "Food{" +
                "bestBeforeDate='" + bestBeforeDate + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", measure='" + measure + '\'' +
                '}';
    }
}
