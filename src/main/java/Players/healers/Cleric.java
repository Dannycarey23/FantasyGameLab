package Players.healers;

import Interfaces.IHeal;
import Players.fighters.Fighter;

public class Cleric extends Fighter {

    private IHeal tool;

    public Cleric(String name, int hp, IHeal tool) {
        super(name, hp);
        this.tool = tool;
    }

    public IHeal getTool() {
        return tool;
    }

    public void setTool(IHeal tool) {
        this.tool = tool;
    }

    public String catchPhrase(){
        return "Get some sawdust on it. Gee it 10 minutes, it'll be right as rain.";
    }
}
