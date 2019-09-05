package decorators;

import interfaces.IAttack;
import interfaces.IDefense;
import interfaces.IMove;
import models.Character;

public abstract class CharacterDecorator extends Character {

    protected Character character;

    public CharacterDecorator(Character character, String name, IMove move, IAttack attack, IDefense defense) {
        super(name, move, attack, defense);
        this.character = character;
    }

    public Character getCharacter() {
        return character.getCharacter();
    }

}
