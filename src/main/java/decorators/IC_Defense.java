package decorators;

import models.Character;

  public class IC_Defense extends CharacterDecorator{

  public IC_Defense(Character character){
      super(character, character.getName(), character.getMove(), character.getAttack(), character.getDefense());
    }

    public String defense() {
        return character.defense() + " | I'm defending myself with my Invisibility Cap";
    }

      public String train() {
          return null;
      }
  }
