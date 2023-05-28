package oop.homework.hw7;

import model.weapons.Sword;

import java.util.Random;

public class Knight extends Figter {
    public Knight(String name, Sword weapon, EpicArmor armor) {
        super(name, weapon, armor);
    }

    @Override
    public void attack(Character target) {
        var rnd = new Random();
        // Рыцарь бьет сильнее, но точность хуже
        target.setDamage(rnd.nextInt(0, super.getWeapon().getDamage()) + (super.getLevel() + 1) * rnd.nextInt(0, super.getWeapon().getDamage()) / 4);
        super.attack(target);
    }
}
