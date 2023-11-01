package Players.fighters;

import Interfaces.IWeapon;

public class Dwarf extends Fighter{

    public Dwarf(String name, int hp, IWeapon weapon) {
        super(name, hp, weapon);
    }

    public String catchPhrase(){
        return "Nobody tosses a dwarf!";
    }
}
