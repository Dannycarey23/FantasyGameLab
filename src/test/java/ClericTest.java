import Interfaces.IHeal;
import Players.healers.Cleric;
import Players.healers.tools.Elixer;
import Players.healers.tools.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Elixer elixer;
    Potion potion;

    @Before
    public void before(){
        elixer = new Elixer();
        potion = new Potion();
        cleric = new Cleric("Karen", 100, potion);
    }

    @Test
    public void hasName(){
        assertEquals("Karen", cleric.getName());
    }


    @Test
    public void hasHP(){
        assertEquals(100, cleric.getHp());
    }

    @Test
    public void hasHealingTool(){
        assertEquals(potion, cleric.getTool());
    }
    @Test
    public void hasCatchPhrase(){
        assertEquals("Get some sawdust on it. Gee it 10 minutes, it'll be right as rain.", cleric.catchPhrase());
    }
}
