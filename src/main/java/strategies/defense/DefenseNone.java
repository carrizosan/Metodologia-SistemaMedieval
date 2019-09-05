package strategies.defense;

import interfaces.IDefense;

public class DefenseNone implements IDefense {
    public String defense() {
        return "I don't have any weapons";
    }
}
