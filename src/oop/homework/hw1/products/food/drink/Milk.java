package oop.homework.hw1.products.food.drink;

//молоко
public class Milk extends Drink {
    protected double fatPercentage;


    public Milk(String name, double cost, double quantity, String measure, String bestBeforeDate, double volume, double fatPercentage) {
        super(name, cost, quantity, measure, bestBeforeDate, volume);
        this.fatPercentage = fatPercentage;
    }

    public double getFatPercentage() {
        return fatPercentage;
    }

    public void setFatPercentage(double fatPercentage) {
        this.fatPercentage = fatPercentage;
    }

    @Override
    public String toString() {
        return "Milk{" +
                "fatPercentage=" + fatPercentage +
                ", bestBeforeDate='" + bestBeforeDate + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", measure='" + measure + '\'' +
                '}';
    }
}
