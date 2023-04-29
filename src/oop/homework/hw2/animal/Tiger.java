package oop.homework.hw2.animal;

public class Tiger extends WildAnimal implements Soundable{
    public Tiger(String colorOfEyes, double height, double weight, String pointOfArea, String date) {
        super(colorOfEyes, height, weight, pointOfArea, date);
    }

    @Override
    public String toString() {
        return "Tiger "+super.toString();
    }

    @Override
    public void sound() {
        System.out.println("REEE ");
    }
}
