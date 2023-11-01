package Players.fighters;

import Interfaces.IWeapon;

public class Barbarian extends Fighter{

    public Barbarian(String name, int hp, IWeapon weapon) {
        super(name, hp, weapon);

    }

    public String catchPhrase(){
        return "I have the power!";
    }
}
