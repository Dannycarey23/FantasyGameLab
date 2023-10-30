package Players.fighters.weapons;

import Interfaces.IWeapon;

public class Club implements IWeapon {
    private int damage;

    public Club(int damage) {
        this.damage = damage;
    }

    @Override
    public int attack() {
        return 0;
    }
}
