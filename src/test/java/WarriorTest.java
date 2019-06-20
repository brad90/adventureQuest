import equipment.Armour;
import equipment.Treasure;
import equipment.Weapons;
import org.junit.Before;
import org.junit.Test;
import player.Warrior;

import static org.junit.Assert.assertEquals;

public class WarriorTest {


    Warrior warrior;
    Armour armour;
    Weapons weapon;
    Treasure treasure;

    @Before
    public void before(){
        warrior = new Warrior("Rory Stewart", 100, Weapons.SWORD, Armour.MEATSHEILD);
    }


    @Test
    public void getName(){
        assertEquals("Rory Stewart", warrior.getName());
    }


    @Test
    public void getHP(){
        assertEquals(100, warrior.getHp());
    }

    @Test
    public void getWeapon(){
        assertEquals(Weapons.SWORD, warrior.getWeapon());
    }

    @Test
    public void getArmour(){
        assertEquals(Armour.MEATSHEILD, warrior.getArmour());
    }


    @Test
    public void getValueOfSatchel(){
        assertEquals(0, warrior.getSatchel());
    }

    @Test
    public void getValueOfSatchelAfterPickingUpStuff(){
        warrior.addTreasureToSatchel(Treasure.APPLESHARES);
        assertEquals(200,warrior.getSatchel());
    }




}
