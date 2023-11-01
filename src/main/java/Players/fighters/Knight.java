package Players.fighters;

import Interfaces.IWeapon;

public class Knight extends Fighter{

    public Knight(String name, int hp, IWeapon weapon) {
        super(name, hp, weapon);

    }

    public String catchPhrase(){
        return "It's just a flesh wound";
    }
}
