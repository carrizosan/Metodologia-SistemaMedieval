package factories;

import interfaces.IAttack;
import interfaces.IDefense;
import interfaces.IMove;
import models.Character;
import models.Wizard;

public class WizardFactory extends CharacterFactory {

    public Character createCharacter(String name, IMove move, IAttack attack, IDefense defense) {
        return new Wizard(name, move, attack, defense);
    }
}
