package oopHomework7.fighter;

import oopHomework7.weapon.Weapon;

public abstract class Fighter {   // боец класс родитель
    protected int health;//здороье
    protected int powerStrike;// сила удара
    protected Weapon weapon;

    public Fighter(int health, int powerStrike, Weapon weapon) {
        this.health = health;
        this.powerStrike = powerStrike;
        this.weapon = weapon;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getPowerStrike() {
        return powerStrike;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
