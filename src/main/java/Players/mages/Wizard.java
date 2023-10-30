package Players.mages;

public class Wizard extends Mage{
    public Wizard(String name, int hp) {
        super(name, hp);
    }

    @Override
    public int defend() {
        return 0;
    }

    @Override
    public int cast() {
        return 0;
    }
}
