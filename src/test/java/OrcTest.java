import Enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc(100);
    }

    @Test
    public void canTakeDamage(){
        orc.takeDamage(10);
        assertEquals(90, orc.getHp());
    }
}
