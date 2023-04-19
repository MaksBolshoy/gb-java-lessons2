package oop.homework.hw1.products;
// товары
public class Product {

    protected String name;
    protected double cost;
    protected double quantity;
    protected String measure;

    public Product(String name, double cost, double quantity, String measure) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.measure = measure;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    @Override
    public String toString() {
        return String.format("Наименование: %s; Цена: %s; Количество: %s; Еденица измерения: %s;", this.name,
                this.cost, this.quantity, this.measure);
    }


}


