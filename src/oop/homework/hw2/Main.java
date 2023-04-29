package oop.homework.hw2;

import oop.homework.hw2.animal.*;

public class Main {
    public static void main(String[] args) {
        //Cat waska =new Cat("grein", 20,3,"Васька ","Домашний", "Черный", true,"1января");
        Cat toop =new Cat(true,"black", 20,3,"Tom","home","ser",true,"2 anura");
        Dog dik= new Dog("black",2,15,"Dik","dwor","black",true,"3 jnuari",false);
        Tiger tigr = new Tiger("black",34,19,"ussurisk","wzera");
        Stork stork = new Stork("bl", 3, 2,1500);
        Zoo zoo = new Zoo();
        zoo.addAnimal(toop).addAnimal(dik).addAnimal(tigr).addAnimal(stork);
        zoo.getInfoOfAllAnimals();
        zoo.getInfo(2);
        zoo.getInfo(0);
        zoo.getSound(0);
    }
}
