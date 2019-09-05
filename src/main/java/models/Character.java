package models;

import interfaces.IAttack;
import interfaces.IDefense;
import interfaces.IMove;

public abstract class Character {
    String name;
    IMove move;
    IAttack attack;
    IDefense defense;

    public Character(String name, IMove move, IAttack attack, IDefense defense) {
        this.name = name;
        this.move = move;
        this.attack = attack;
        this.defense = defense;
    }

    public String move() {
        return move.move();
    }

    public String attack() {
        return attack.attack();
    }

    public String defense() {
        return defense.defense();
    }


    public String getName() {
        return name;
    }

    public void setAttack(IAttack attack) {
        this.attack = attack;
    }

    public void setDefense(IDefense defense) {
        this.defense = defense;
    }

    public void setMove(IMove move) {
        this.move = move;
    }

    public IMove getMove() {
        return move;
    }

    public IAttack getAttack() {
        return attack;
    }

    public IDefense getDefense() {
        return defense;
    }

    @Override
    public String toString() {
        return  "Name: " +
                this.getName() +

                "| Movement: " +
                this.getMove() +
                "| Attack:"+ this.getAttack() + this.getDefense() ;
    }

    public Character getCharacter(){
        return this;
    }

    public abstract String train();
}
