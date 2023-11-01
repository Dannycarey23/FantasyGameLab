package Players.mages;

import Interfaces.IDefend;
import Interfaces.ISpell;

public class Wizard extends Mage{
    public Wizard(String name, int hp, IDefend beast, ISpell spell) {
        super(name, hp, beast, spell);
    }

    public String catchPhrase(){
        return "You shall not pass!";
    }

}
