package Players.mages.spells;

import Interfaces.ISpell;

public class IceBlast implements ISpell {

    int power;

    public IceBlast(int power) {
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
