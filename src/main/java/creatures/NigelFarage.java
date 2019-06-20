package creatures;

import player.Player;

public class NigelFarage extends Creature {


    public NigelFarage(String name, int hp, int attack) {
        super(name, hp, attack);
    }

    public void takeDamage(int damage){
        this.hp -= damage;
    }

    public void attack(Player player) {
        player.takeDamage(this.getAttack());
    }

}
