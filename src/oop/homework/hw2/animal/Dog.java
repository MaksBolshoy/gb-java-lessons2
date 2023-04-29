package oop.homework.hw2.animal;

public class Dog extends HomeAnimal implements Soundable{
    protected boolean trained;

    public Dog(String colorOfEyes, double height, double weight, String name, String breed, String colorWool, boolean vaccinated, String birthday, boolean trained) {
        super(colorOfEyes, height, weight, name, breed, colorWool, vaccinated, birthday);
        this.trained = trained;
    }

    public boolean isTrained() {//метод который проверяет дрессированная собака или нет
        return trained;
    }
    public void train(){//метод который тренирует собаку
        if (isTrained()) {//если поле trained true то выполнится код на след строке
            System.out.println("Cобака дрессирована . В повторной дрессировке не нуждается ");

        }
        else {// если поле traiged false то код ниже
            trained = true;
            System.out.println("Собака прошла дрессировку ");
        }

 }
    @Override
    public String toString() {
        return "Dog{" +
                "trained=" + trained +
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
        System.out.println("GAW");
    }
}
