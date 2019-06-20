package creatures;

import behaviour.IAttack;
import player.Player;

public abstract class Creature extends Player implements IAttack {

    private int attack;

    public Creature(String name, int hp, int attack){
        super(name, hp);
        this.attack = attack;
    }


    public int getAttack() {
        return attack;
    }
}
