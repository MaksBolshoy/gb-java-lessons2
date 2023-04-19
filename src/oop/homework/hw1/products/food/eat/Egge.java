package oop.homework.hw1.products.food.eat;

import oop.homework.hw1.products.food.Food;

// яйцо
public class Egge extends Food {
    protected int countInBox;

    public Egge(String name, double cost, double quantity, String measure, String bestBeforeDate, int countInBox) {
        super(name, cost, quantity, measure, bestBeforeDate);
        this.countInBox = countInBox;
    }

    public int getCountInBox() {
        return countInBox;
    }

    public void setCountInBox(int countInBox) {
        this.countInBox = countInBox;
    }

    @Override
    public String toString() {
        return "Egge{" +
                "countInBox=" + countInBox +
                ", bestBeforeDate='" + bestBeforeDate + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", measure='" + measure + '\'' +
                '}';
    }
}
