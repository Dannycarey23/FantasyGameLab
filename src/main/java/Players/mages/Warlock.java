package Players.mages;

import Interfaces.IDefend;
import Interfaces.ISpell;

public class Warlock extends Mage{
    public Warlock(String name, int hp, IDefend beast, ISpell spell) {
        super(name, hp, beast, spell);
    }

    public String catchPhrase(){
        return "I see dead people...";
    }

}
