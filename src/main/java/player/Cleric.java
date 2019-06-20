package player;

import Room.Room;
import equipment.CookingIngredients;

public class Cleric extends Player {

    public Cleric(String name, int hp, Room room) {
        super(name, hp, room );
    }

    public void takeDamage(int damage){
        this.hp -= damage;
    }


    public void Heal(Player player, CookingIngredients cookingIngredients) {
        player.hp += cookingIngredients.getValue();
    }
}
