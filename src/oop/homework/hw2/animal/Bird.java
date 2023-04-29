package oop.homework.hw2.animal;

public class Bird extends Animal {
    protected double heightOfFly;//высота палета птицы

    public Bird(String colorOfEyes, double height, double weight, double heightOfFly) {
        super(colorOfEyes, height, weight);
        this.heightOfFly = heightOfFly;
    }

    public void fly(){
        System.out.println("Я лечу на "+heightOfFly+" метров ");
    }
    public double getHeightOfFly() {
        return heightOfFly;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "heightOfFly=" + heightOfFly +
                ", colorOfEyes='" + colorOfEyes + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
