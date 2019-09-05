package models;

import interfaces.IAttack;
import interfaces.IDefense;
import interfaces.IMove;
import strategies.move.MoveFly;

public class Warrior extends Character {

    public Warrior(String name, IMove move, IAttack attack, IDefense defense) throws Exception {
        super(name, move, attack, defense);
        if (move.getClass().equals(MoveFly.class)) {
            throw new Exception("The warrior CANNOT fly !");
        }
    }

    public String train() {
        return "Training as a Warrior";
    }
}
