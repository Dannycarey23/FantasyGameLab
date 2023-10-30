package Players.mages;

public class Warlock extends Mage{
    public Warlock(String name, int hp) {
        super(name, hp);
    }

    public String catchPhrase(){
        return "I see dead people...";
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
