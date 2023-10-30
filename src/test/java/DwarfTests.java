import Interfaces.IWeapon;
import Players.fighters.Dwarf;
import Players.fighters.weapons.Axe;
import org.junit.Before;

public class DwarfTests {
    Dwarf dwarf;


    @Before
    public void before(){
        dwarf = new Dwarf("Gimli", 100, null);
    }
}
