package oop.homework.hw2.animal;

public class Wolf extends WildAnimal implements Soundable{
    private boolean leader;

    public Wolf(String colorOfEyes, double height, double weight, String pointOfArea, String date, boolean leader) {
        super(colorOfEyes, height, weight, pointOfArea, date);
        this.leader = leader;
    }

    public boolean isLeader() {
        return leader;
    }

    public void setLeader(boolean leader) {
        this.leader = leader;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "leader=" + leader +
                ", colorOfEyes='" + colorOfEyes + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void sound() {
        System.out.println("WOOOOO");
    }
}
