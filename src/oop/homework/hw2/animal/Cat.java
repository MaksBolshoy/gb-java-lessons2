package oop.homework.hw2.animal;

public class Cat extends HomeAnimal implements Soundable{
    protected boolean wool;
    public Cat(boolean wool, String colorOfEyes, double height, double weight, String name, String breed, String colorWool, boolean vaccinated, String birthday) {
        super(colorOfEyes, height, weight, name, breed, colorWool, vaccinated, birthday);
       this.wool =  wool;
    }


    public boolean isWool(boolean wool) {
        return wool;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "wool=" + wool +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", colorWool='" + colorWool + '\'' +
                ", vaccinated=" + vaccinated +
                ", birthday='" + birthday + '\'' +
                ", colorOfEyes='" + colorOfEyes + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void sound() {
        System.out.println("MAU");
    }
}
