package Players.mages;

import Interfaces.IDefend;
import Interfaces.ISpell;
import Players.Player;

public abstract class Mage extends Player implements ISpell, IDefend{
    public Mage(String name, int hp) {
        super(name, hp);
    }
}
