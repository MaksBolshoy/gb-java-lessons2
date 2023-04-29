package oop.homework.hw2.animal;

public class Animal {
    protected String colorOfEyes;
    protected double height;
    protected double weight;

    public Animal(String colorOfEyes, double height, double weight) {
        this.colorOfEyes = colorOfEyes;
        this.height = height;
        this.weight = weight;
    }

    public void voice(){
        System.out.println("Животное издает звук ");
    }

    public String getColorOfEyes() {
        return colorOfEyes;
    }

    public void setColorOfEyes(String colorOfEyes) {
        this.colorOfEyes = colorOfEyes;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "colorOfEyes='" + colorOfEyes + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
