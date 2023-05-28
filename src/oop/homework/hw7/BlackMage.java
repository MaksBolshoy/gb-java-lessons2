package oop.homework.hw7;

import model.base.Weapon;

public class BlackMage extends Mage {
    public BlackMage(String name, WizardsStaff weapon, MagiciansRobe armor) {
        super(name, (Weapon) weapon, (Armor) armor);
    }
}
