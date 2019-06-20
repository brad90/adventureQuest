package Room;

import creatures.Creature;
import equipment.Treasure;

public class Dungeon extends Room {
    public Dungeon(String name, Treasure treasure, Creature creature) {
        super(name, treasure, creature);
    }
}
