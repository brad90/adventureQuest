import creatures.NigelFarage;
import equipment.Armour;
import equipment.Weapons;
import org.junit.Before;
import org.junit.Test;
import player.Warrior;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

    NigelFarage nigel;
    Warrior warrior;


    @Before
    public void before() {
        nigel = new NigelFarage("Nigel", 50, 10 ){
        };
    }


    @Test
    public void getName(){
        assertEquals("Nigel", nigel.getName());
    }


    @Test
    public void getHP(){
        assertEquals(50, nigel.getHp());
    }


    @Test
    public void getHealthAfterAttack(){
        warrior = new Warrior("Bob", 100, Weapons.AXE, Armour.STEELARMOUR);
        warrior.attack(nigel);
        assertEquals(30, nigel.getHp());
    }
}
