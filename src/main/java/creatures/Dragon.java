package creatures;

import player.Player;

public class Dragon extends Creature {
    public Dragon(String name, int hp) {
        super(name, hp);
    }

    public void takeDamage(int damage){
        this.hp = this.hp - damage;
    }


    public void attack(Player player) {

    }
}
