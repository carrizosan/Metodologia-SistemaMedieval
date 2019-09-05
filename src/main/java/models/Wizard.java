package models;

import interfaces.IAttack;
import interfaces.IDefense;
import interfaces.IMove;

public class Wizard extends Character {

    public Wizard(String name, IMove move, IAttack attack, IDefense defense) {
        super(name, move, attack, defense);
    }

    public String train() {
        return "Training as a Wizard";
    }
}
