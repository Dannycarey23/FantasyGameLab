import Interfaces.IWeapon;
import Players.fighters.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    IWeapon axe;
    IWeapon club;
    IWeapon sword;
    @Before
    public void before(){

        dwarf = new Dwarf("Gimli", 100, Axe);
    }

    @Test
    public void dwarfHasName(){
        assertEquals("Gimli", dwarf.getName());
    }
}
