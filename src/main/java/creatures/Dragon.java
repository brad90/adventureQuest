package creatures;

import player.Player;

public class Dragon extends Creature {
    public Dragon(String name, int hp, int attack) {
        super(name, hp, attack);
    }

    public void takeDamage(int damage){
        this.hp -= damage;
    }


    public void attack(Player player) {
        player.takeDamage(this.getAttack());
    }
}
