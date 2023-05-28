package oop.homework.hw7;

import model.base.Heal;
import model.weapons.Hands;

public class WhiteMage extends Mage implements Heal {
    public WhiteMage(String name, Armor armor) {
        super(name, new Hands(), armor);
    }

    @Override
    public void heal(Character character) {
        character.setHealthPoints((super.getLevel() + 1) * 2);
        setExperience((int)Math.pow(10,character.getLevel()));
        this.decreaseMana(character.getLevel() + 1);
    }
}
