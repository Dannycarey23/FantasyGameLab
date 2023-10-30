package Players.fighters.weapons;

import Interfaces.IWeapon;

public class Axe implements IWeapon {
    private int damage;

    public Axe(int damage) {
        this.damage = damage;
    }

    @Override
    public int attack() {
        return 0;
    }
}
