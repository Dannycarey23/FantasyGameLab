import Interfaces.IWeapon;
import Players.fighters.Dwarf;
import Players.fighters.weapons.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTests {
    Dwarf dwarf;
    @Before
    public void before(){
        IWeapon Axe = null;
        dwarf = new Dwarf("Gimli", 100, Axe);
    }

    @Test
    public void dwarfHasName(){
        assertEquals("Gimli", dwarf.getName());
    }
}
