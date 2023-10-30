package Players.fighters;

public class Barbarian extends Fighter{

    public Barbarian(String name, int hp) {
        super(name, hp);
    }

    public String catchPhrase(){
        return "I have the power!";
    }
}
