package player;

import behaviour.ITakeDamage;
import equipment.Treasure;

public abstract class Player implements ITakeDamage {

    private String name;
    protected int hp;
    private int satchel;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.satchel = 0;
    }


    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getSatchel() {
        return satchel;
    }


    public void addTreasureToSatchel(Treasure treasure){
        this.satchel += treasure.getValue();
    }


}
