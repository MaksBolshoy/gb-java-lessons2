package oopHomework7.fighter.mellee;

import oopHomework7.Attack;
import oopHomework7.Defence;
import oopHomework7.fighter.Fighter;
import oopHomework7.weapon.melee.Sword;

public class Swordsman extends Fighter implements Attack, Defence {
    private int maxhealth;

    public Swordsman(int health, int powerStrike, Sword weapon) {
        super(health, powerStrike, weapon);
        this.maxhealth = health;
    }

    //меченосец


    @Override
    public void attack(Fighter fighter) {

        fighter.setHealth(fighter.getHealth() - this.powerStrike);
        if (fighter.getHealth() <= 0) {
            System.out.println("Противник побежден  после удара мечем ");
        }
    }

    @Override
    public void defence() {
        if (this.health < maxhealth) {
            this.setHealth(this.health + 2);

        }

    }

}

