package Players.fighters;

import Interfaces.IWeapon;
import Players.Player;

public abstract class Fighter extends Player{
    private IWeapon weapon;
    public Fighter(String name, int hp, IWeapon weapon) {
        super(name, hp);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }
}
