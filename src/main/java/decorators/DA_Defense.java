package decorators;

import models.Character;

public class DA_Defense extends CharacterDecorator {

    public DA_Defense(Character character) {
        super(character, character.getName(), character.getMove(), character.getAttack(), character.getDefense());
    }

    public String defense() {
        return character.defense() + " | I'm defending myself with my Anti-Damage Armour";
    }

    public String train() {
        return null;
    }

}

