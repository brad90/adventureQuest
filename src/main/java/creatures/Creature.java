package creatures;

import behaviour.IAttack;
import player.Player;

public abstract class Creature extends Player implements IAttack {

    private String name;
    protected int hp;

    public Creature(String name, int hp){
        super(name, hp);
    }


    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }



}
