package factories;

import interfaces.IAttack;
import interfaces.IDefense;
import interfaces.IMove;
import models.Character;
import models.Dwarf;

public class DwarfFactory extends CharacterFactory {

    public Character createCharacter(String name, IMove move, IAttack attack, IDefense defense) {
        try {
            return new Dwarf(name, move, attack, defense);
        } catch (Exception e) {
            return null;
        }
    }
}
