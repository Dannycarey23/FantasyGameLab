package Players.fighters;

import Interfaces.IWeapon;

public class Dwarf extends Fighter{
    private IWeapon weapon;

    public Dwarf(String name, int hp, IWeapon weapon) {
        super(name, hp);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public String catchPhrase(){
        return "Nobody tosses a dwarf!";
    }
}
