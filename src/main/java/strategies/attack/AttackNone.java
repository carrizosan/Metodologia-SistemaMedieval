package strategies.attack;

import interfaces.IAttack;

public class AttackNone implements IAttack {
    public String attack() {
        return "I don't have any weapons";
    }
}
