package models;

import interfaces.IAttack;
import interfaces.IDefense;
import interfaces.IMove;
import strategies.move.MoveFly;

public class Dwarf extends Character {

    public Dwarf(String name, IMove move, IAttack attack, IDefense defense) throws Exception {
        super(name, move, attack, defense);
        if (move.getClass().equals(MoveFly.class)) {
            throw new Exception("The dwarf CANNOT fly !");
        }
    }

    public String train() {
        return "Training as a Dwarf";
    }

}
