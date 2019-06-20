package creatures;

import Room.Room;
import behaviour.IAttack;
import player.Player;

public abstract class Creature extends Player implements IAttack {

    private int attack;

    public Creature(String name, int hp, Room room, int attack){
        super(name, hp, room);
        this.attack = attack;
    }


    public int getAttack() {
        return attack;
    }
}
