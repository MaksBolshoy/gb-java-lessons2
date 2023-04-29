package oop.homework.hw2.animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();

    }

    public Zoo addAnimal(Animal animal) {
        animals.add(animal);
        return this;

    }
    public Zoo removeAnimal(int index) {
        animals.remove(index);
        return this;

    }
    public void getInfo(int index) {
        System.out.println(animals.get(index));
    }
    public void getInfoOfAllAnimals() {
        for (Animal animal:animals){
            System.out.println(animal);
        }
    }
    public void getSound(int index){
        Animal animal = animals.get(index); // получаем из списка животных зоопарка анималс животное по индексу этого списка
        if(animal instanceof Soundable){//усли животное реализует интерфейс соундабл то
             ((Soundable) animal).sound();// то приводим  тип Анималс к типу Соундобл и вызываем метод соунд ( издать звук)
        }
        else{
            System.out.println("Это животное не издает звуков ");
        }
    }
    public List<Animal> getAnimals() {
        return animals;
    }
}
