package factories;

import interfaces.IAttack;
import interfaces.IDefense;
import interfaces.IMove;
import models.Character;
import models.Warrior;

public class WarriorFactory extends CharacterFactory {

    public Character createCharacter(String name, IMove move, IAttack attack, IDefense defense) {
        try {
            return new Warrior(name, move, attack, defense);
        } catch (Exception e) {
            return null;
        }
    }
}
