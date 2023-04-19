package oop.homework.hw1.products.childens;

//подгузники
public class Diapers extends Childens {
    private double size;
    private double minWeight;
    private double maxWeight;
    private String type;


    public Diapers(String name, double cost, double quantity, String measure, double minimumAge, String hypoAllerg, double size, double minWeight, double maxWeight, String type) {
        super(name, cost, quantity, measure, minimumAge, hypoAllerg);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(double minWeight) {
        this.minWeight = minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Diapers{" +
                "size=" + size +
                ", minWeight=" + minWeight +
                ", maxWeight=" + maxWeight +
                ", type='" + type + '\'' +
                ", minimumAge=" + minimumAge +
                ", hypoAllerg='" + hypoAllerg + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", measure='" + measure + '\'' +
                '}';
    }
}
