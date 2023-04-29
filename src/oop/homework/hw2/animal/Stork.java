package oop.homework.hw2.animal;

public class Stork extends Bird{
    public Stork(String colorOfEyes, double height, double weight, double heightOfFly) {
        super(colorOfEyes, height, weight, heightOfFly);
    }

    @Override
    public String toString() {
        return "Stork "+super.toString();
    }
}
