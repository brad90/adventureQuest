package Room;

import creatures.Creature;
import equipment.Treasure;
import player.Player;

public class Dungeon extends Room {

    public Dungeon(String name, Treasure treasure, Creature creature, Player player) {
        super(name, treasure, creature, player);
    }


}
