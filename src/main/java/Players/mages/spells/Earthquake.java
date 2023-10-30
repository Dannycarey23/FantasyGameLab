package Players.mages.spells;

import Interfaces.ISpell;

public class Earthquake implements ISpell {
    int power;

    public Earthquake(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public int cast() {
        return 0;
    }
}
