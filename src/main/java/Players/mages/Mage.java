package Players.mages;

import Interfaces.IDefend;
import Interfaces.ISpell;
import Players.Player;

public abstract class Mage extends Player {
    private IDefend beast;
    private ISpell spell;
    public Mage(String name, int hp, IDefend beast, ISpell spell) {
        super(name, hp);
        this.beast = beast;
        this.spell = spell;
    }

    public IDefend getBeast() {
        return beast;
    }

    public void setBeast(IDefend beast) {
        this.beast = beast;
    }

    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }
}
