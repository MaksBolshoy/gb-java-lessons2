package oop.homework.hw1.products.childens;

import oop.homework.hw1.products.Product;

// детские товары
public class Childens extends Product {
protected double minimumAge;
protected  String hypoAllerg;

    public Childens(String name, double cost, double quantity, String measure, double minimumAge, String hypoAllerg) {
        super(name, cost, quantity, measure);
        this.minimumAge = minimumAge;
        this.hypoAllerg = hypoAllerg;
    }

    public double getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(double minimumAge) {
        this.minimumAge = minimumAge;
    }

    public String getHypoAllerg() {
        return hypoAllerg;
    }

    public void setHypoAllerg(String hypoAllerg) {
        this.hypoAllerg = hypoAllerg;
    }

    @Override
    public String toString() {
        return "Childens{" +
                "minimumAge=" + minimumAge +
                ", hypoAllerg='" + hypoAllerg + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", measure='" + measure + '\'' +
                '}';
    }
}
