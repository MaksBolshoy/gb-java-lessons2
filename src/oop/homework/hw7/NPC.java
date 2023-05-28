package oop.homework.hw7;

import model.weapons.Hands;

public class NPC extends Character {
    public NPC(String name) {
        super(name, new Hands(), new Tatters());
    }
}
