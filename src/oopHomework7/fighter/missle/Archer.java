package oopHomework7.fighter.missle;

import oopHomework7.Attack;
import oopHomework7.fighter.Fighter;
import oopHomework7.weapon.missle.Bow;

public class Archer extends Fighter implements Attack {
    private final int maxhealth;

    public Archer(int health, int powerStrike, Bow weapon) {
        super(health, powerStrike, weapon);
        this.maxhealth = health;
    }  //лучник

    @Override
    public void attack(Fighter fighter) {
        fighter.setHealth(fighter.getHealth()-this.powerStrike);
        if (fighter.getHealth()<=0){
            System.out.println("Противник побежден ");
        }

    }
}
