package Players.fighters.weapons;

import Interfaces.IWeapon;

public class Sword implements IWeapon {
    private int damage;

    public Sword(int damage) {
        this.damage = damage;
    }

    @Override
    public int attack() {
        return 0;
    }
}
