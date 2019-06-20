import Room.Dungeon;
import creatures.NigelFarage;
import equipment.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {


    Dungeon dungeon;
    NigelFarage nigel;



    @Before
    public void before(){
        nigel = new NigelFarage("Nigel", 50);
        dungeon = new Dungeon("The evil dungeon", Treasure.APPLESHARES, nigel );
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
}
