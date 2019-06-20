package creatures;

import Room.Room;
import player.Player;

public class Oger extends Creature {
    public Oger(String name, int hp, Room room, int attack) {
        super(name, hp, room , attack);
    }

    public void takeDamage(int damage){
        this.hp -= damage;
    }


    public void attack(Player player) {
        player.takeDamage(this.getAttack());
    }
}
