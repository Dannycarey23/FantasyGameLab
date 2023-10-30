package Players.fighters;

import Interfaces.IWeapon;

public class Knight extends Fighter{
    private IWeapon weapon;

    public Knight(String name, int hp, IWeapon weapon) {
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
        return "It's just a flesh wound";
    }
}
