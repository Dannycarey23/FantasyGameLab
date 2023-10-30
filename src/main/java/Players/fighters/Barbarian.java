package Players.fighters;

import Interfaces.IWeapon;

public class Barbarian extends Fighter{

    private IWeapon weapon;

    public Barbarian(String name, int hp, IWeapon weapon) {
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
        return "I have the power!";
    }
}
