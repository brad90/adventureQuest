package creatures;

import player.Player;

public class NigelFarage extends Creature {
    public NigelFarage(String name, int hp) {
        super(name, hp);
    }

    public void takeDamage(int damage){
        hp -= damage;
    }



    public void attack(Player player) { }
}
