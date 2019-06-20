import Room.Dungeon;
import creatures.NigelFarage;
import equipment.Armour;
import equipment.Treasure;
import equipment.Weapons;
import org.junit.Before;
import org.junit.Test;
import player.Warrior;

import static org.junit.Assert.assertEquals;

public class RoomTest {


    Dungeon dungeon;
    NigelFarage nigel;
    Warrior warrior;



    @Before
    public void before(){
        warrior = new Warrior("Rory Stewart", 100, dungeon, Weapons.SWORD, Armour.MEATSHEILD);
        nigel = new NigelFarage("Nigel", 50, dungeon,10 );
        dungeon = new Dungeon("The evil dungeon", Treasure.APPLESHARES, nigel, warrior );
    }


    @Test
    public void getName(){
        assertEquals("The evil dungeon", dungeon.getName());
    }

    @Test
    public void getCreature(){
        assertEquals(nigel, dungeon.getCreature());
    }

    @Test
    public void getTreasure(){
        assertEquals(Treasure.APPLESHARES, dungeon.getTreasure());
    }

    @Test
    public void treasureFound(){
        warrior.addTreasureToSatchel(dungeon);
        assertEquals(null, dungeon.getTreasure() );
    }
}
