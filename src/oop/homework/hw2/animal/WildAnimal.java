package oop.homework.hw2.animal;

public class WildAnimal extends Animal{
    private String pointOfArea;
    private String date;

    public WildAnimal(String colorOfEyes, double height, double weight, String pointOfArea, String date) {
        super(colorOfEyes, height, weight);
        this.pointOfArea = pointOfArea;
        this.date = date;
    }

    public String getPointOfArea() {
        return pointOfArea;
    }

    public void setPointOfArea(String pointOfArea) {
        this.pointOfArea = pointOfArea;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "pointOfArea='" + pointOfArea + '\'' +
                ", date='" + date + '\'' +
                ", colorOfEyes='" + colorOfEyes + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
