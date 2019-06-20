package player;

import Room.Room;
import behaviour.ITakeDamage;

public abstract class Player implements ITakeDamage {

    private String name;
    protected int hp;
    private int satchel;
    private Room room;

    public Player(String name, int hp, Room room) {
        this.name = name;
        this.hp = hp;
        this.satchel = 0;
        this.room = room;
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


    public void addTreasureToSatchel(Room room){
        this.satchel += room.getTreasure().getValue();
        room.setTreasureToEmpty();
    }


}
