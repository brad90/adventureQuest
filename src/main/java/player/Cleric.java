package player;

import equipment.CookingIngredients;

public class Cleric extends Player {

    public Cleric(String name, int hp) {
        super(name, hp);
    }

    public void takeDamage(int damage){
        this.hp -= damage;
    }


    public void Heal(Player player, CookingIngredients cookingIngredients) {
        player.hp += cookingIngredients.getValue();
    }
}
