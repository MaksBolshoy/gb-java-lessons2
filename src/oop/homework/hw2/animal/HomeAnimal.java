package oop.homework.hw2.animal;

public class HomeAnimal extends Animal{
    protected String name;
    protected String breed;
    protected String colorWool;
    protected boolean vaccinated;
    protected  String birthday;

    public HomeAnimal(String colorOfEyes, double height, double weight, String name, String breed, String colorWool, boolean vaccinated, String birthday) {
        super(colorOfEyes, height, weight);
        this.name = name;
        this.breed = breed;
        this.colorWool = colorWool;
        this.vaccinated = vaccinated;
        this.birthday = birthday;
    }
    public void showAffection(){
        System.out.println("Домашнее животное проявляет ласку ");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColorWool() {
        return colorWool;
    }

    public void setColorWool(String colorWool) {
        this.colorWool = colorWool;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "HomeAnimal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", colorWool='" + colorWool + '\'' +
                ", vaccinated=" + vaccinated +
                ", birthday='" + birthday + '\'' +
                ", colorOfEyes='" + colorOfEyes + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
