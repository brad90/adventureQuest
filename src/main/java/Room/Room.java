package Room;

import creatures.Creature;
import equipment.Treasure;

public abstract class Room {

    private String name;
    private Treasure treasure;
    private Creature creature;

    public Room(String name, Treasure treasure, Creature creature){
        this.name = name;
        this.treasure = treasure;
        this.creature = creature;
    }


    public String getName() {
        return name;
    }


    public Treasure getTreasure() {
        return treasure;
    }

    public Creature getCreature() {
        return creature;
    }
}
