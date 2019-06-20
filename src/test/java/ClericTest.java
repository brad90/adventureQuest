import Room.Dungeon;
import creatures.NigelFarage;
import equipment.Armour;
import equipment.CookingIngredients;
import equipment.Treasure;
import equipment.Weapons;
import org.junit.Before;
import org.junit.Test;
import player.Cleric;
import player.Warrior;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Warrior warrior;
    Armour armour;
    Weapons weapon;
    Treasure treasure;
    NigelFarage nigel;
    Dungeon dungeon;

    @Before
    public void before(){
        nigel = new NigelFarage("Nigel", 50, dungeon, 10 );
        warrior = new Warrior("Rory Stewart", 100, dungeon, Weapons.SWORD, Armour.MEATSHEILD);
        cleric = new Cleric("bob", 50, dungeon);
        dungeon = new Dungeon("dungeon", Treasure.APPLESHARES, nigel, cleric);
    }


    @Test
    public void getName(){
        assertEquals("bob", cleric.getName());
    }


    @Test
    public void getHP(){
        assertEquals(50, cleric.getHp());
    }


    @Test
    public void getValueOfSatchel(){
        assertEquals(0, cleric.getSatchel());
    }

    @Test
    public void getValueOfSatchelAfterPickingUpStuff(){
        cleric.addTreasureToSatchel(dungeon);
        assertEquals(200, cleric.getSatchel());
    }

    @Test
    public void getHealthAfterAttack(){
        nigel = new NigelFarage("Bob", 100, dungeon,10);
        nigel.attack(cleric);
        assertEquals(40, cleric.getHp());
    }


    @Test
    public void healYourBro(){
        cleric.Heal(warrior, CookingIngredients.HERB);
        assertEquals(105, warrior.getHp());
    }


}
