import Enemies.Enemy;
import Enemies.Orc;
import Interfaces.IDefend;
import Interfaces.ISpell;
import Players.mages.Warlock;
import Players.mages.beasts.DireWolf;
import Players.mages.beasts.Kraken;
import Players.mages.spells.Fireball;
import Players.mages.spells.IceBlast;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
Fireball fireball;
IceBlast iceBlast;
DireWolf direwolf;
Kraken kraken;
Enemy orc;
Warlock warlock;


    @Before
    public void before(){
        fireball = new Fireball(10);
        iceBlast = new IceBlast(20);
        direwolf = new DireWolf();
        kraken = new Kraken();
        orc = new Orc(100);
        warlock = new Warlock("Adam", 100, kraken, fireball);

    }

    @Test
    public void hasName(){
        assertEquals("Adam", warlock.getName());
    }

    @Test
    public void hasHp(){
        assertEquals(100, warlock.getHp());
    }
    @Test
    public void hasBeast(){
        assertEquals(kraken, warlock.getBeast());
    }

    @Test
    public void hasSpell(){
        assertEquals(fireball, warlock.getSpell());
    }


}

