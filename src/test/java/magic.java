import creatures.NigelFarage;
import creatures.Oger;
import equipment.Armour;
import equipment.Spells;
import equipment.Treasure;
import equipment.Weapons;
import org.junit.Before;
import org.junit.Test;
import player.Magic;
import player.Warrior;

import static org.junit.Assert.assertEquals;

public class magic {

    Magic magic;
    Warrior warrior;
    Armour armour;
    Weapons weapon;
    Treasure treasure;
    Oger oger;
    NigelFarage nigel;
    NigelFarage nigel2;


    @Before
    public void before(){
        warrior = new Warrior("Rory Stewart", 100, Weapons.SWORD, Armour.MEATSHEILD);
        oger  = new Oger("Big nige", 30, 10);
        nigel  = new NigelFarage("Big nige", 30, 10);
        nigel2  = new NigelFarage("Big nige", 30, 40);
        magic = new Magic("bob", 50, Spells.LIGHTNING, oger);
    }


    @Test
    public void getName(){
        assertEquals("bob", magic.getName());
    }


    @Test
    public void getHP(){
        assertEquals(50, magic.getHp());
    }


    @Test
    public void getValueOfSatchel(){
        assertEquals(0, magic.getSatchel());
    }

    @Test
    public void getValueOfSatchelAfterPickingUpStuff(){
        magic.addTreasureToSatchel(Treasure.APPLESHARES);
        assertEquals(200,magic.getSatchel());
    }

    @Test
    public void getHealthAfterAttack(){
        nigel = new NigelFarage("Bob", 100, 10);
        nigel.attack(magic);
        assertEquals(50, magic.getHp());
        assertEquals(20, oger.getHp());
    }

    @Test
    public void getHealthAfterAttackPetDead(){
        nigel2.attack(magic);
        assertEquals(50, magic.getHp());
        assertEquals(0, oger.getHp());
    }


}
