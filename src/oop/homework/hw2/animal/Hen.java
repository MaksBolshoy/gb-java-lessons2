package oop.homework.hw2.animal;

public class Hen extends Bird implements Soundable{
    public Hen(String colorOfEyes, double height, double weight, double heightOfFly) {
        super(colorOfEyes, height, weight, heightOfFly);
    }

    @Override
    public String toString() {
        return "Hen "+super.toString();
    }

    @Override
    public void sound() {
        System.out.println("Ko Ko");
    }
}
