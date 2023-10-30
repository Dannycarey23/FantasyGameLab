package Players.mages.spells;

import Interfaces.ISpell;

public class LighteningStrike implements ISpell {

    int power;

    public LighteningStrike(int power) {
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
