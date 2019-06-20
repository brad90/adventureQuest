import Room.Dungeon;
import creatures.NigelFarage;
import equipment.Armour;
import equipment.Treasure;
import equipment.Weapons;
import org.junit.Before;
import org.junit.Test;
import player.Warrior;

import static org.junit.Assert.assertEquals;

public class WarriorTest {


    Warrior warrior;
    Warrior warrior1;
    Armour armour;
    Weapons weapon;
    Treasure treasure;
    NigelFarage nigel;
    Dungeon dungeon;

    @Before
    public void before(){
        warrior = new Warrior("Rory Stewart", 100, dungeon, Weapons.SWORD, Armour.MEATSHEILD);
        dungeon = new Dungeon("Dungeon", Treasure.APPLESHARES, nigel, warrior);
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
        warrior.addTreasureToSatchel(dungeon);
        assertEquals(200,warrior.getSatchel());
    }

    @Test
    public void getHealthAfterAttack(){
        nigel = new NigelFarage("Bob", 100, dungeon,10);
        nigel.attack(warrior);
        assertEquals(92, warrior.getHp());
    }

    @Test
    public void getHealthAfterAttackSteelArmour(){
        warrior1 = new Warrior("Rory Stewart", 100, dungeon,  Weapons.SWORD, Armour.STEELARMOUR);
        nigel = new NigelFarage("Bob", 100, dungeon,10);
        nigel.attack(warrior1);
        assertEquals(95, warrior1.getHp());
    }







}
