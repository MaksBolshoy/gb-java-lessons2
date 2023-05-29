package oopHomework7;

import oopHomework7.fighter.mellee.Swordsman;
import oopHomework7.fighter.missle.Archer;
import oopHomework7.weapon.melee.Sword;
import oopHomework7.weapon.missle.Bow;

import java.util.Random;

public class Arena {
    private  static Random random =new Random();

    public static void fight(){
        Archer archer =new Archer(30,12,new Bow());
        Swordsman swordsman = new Swordsman(25,19,new Sword());
        Swordsman swordsman1 = new Swordsman(65,22,new Sword());
        System.out.println(swordsman1.getWeapon());
        System.out.println(swordsman.getWeapon());
        while (true){
            if (random.nextInt(11)>5){
                System.out.println("Атакует лучник ");
                archer.attack(swordsman);
                if (random.nextInt(0,1)>0){
                    swordsman.defence();
                    System.out.println("У мечника сработала защита ");
                }

                System.out.println("Здоровье мечника равно "+swordsman.getHealth());
            }
            else{
                System.out.println("атакует мечник ");
                swordsman.attack(archer);
                System.out.println("Здоровье лучника  равно "+archer.getHealth());
            }

            if(archer.getHealth()<=0 || swordsman.getHealth()<=0){
                break;
            }
        }
    }
}
