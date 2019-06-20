package Room;

import creatures.Creature;
import equipment.Treasure;
import player.Player;

public abstract class Room {

    private String name;
    private Treasure treasure;
    private Creature creature;
    private Player player;


    public Room(String name, Treasure treasure, Creature creature, Player player){
        this.name = name;
        this.treasure = treasure;
        this.creature = creature;
        this.player = player;
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

    public Player getPlayer() {
        return player;
    }

    public void setTreasureToEmpty(){
        this.treasure = null;
    }
}
