package factories;

import interfaces.IAttack;
import interfaces.IDefense;
import interfaces.IMove;
import models.Character;

public abstract class CharacterFactory {

    public abstract Character createCharacter(String name, IMove move, IAttack attack, IDefense defense);
}
