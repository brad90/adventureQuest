package player;

import behaviour.IAttack;
import creatures.Creature;
import equipment.Spells;

public class Magic extends Player implements IAttack {

    Spells spell;
    Creature creature;



    public Magic(String name, int hp, Spells spell, Creature creature) {
        super(name, hp);
        this.spell = spell;
        this.creature = creature;
    }



    public Spells getSpell() {
        return this.spell;
    }

    public Creature getCreature() {
        return this.creature;
    }

    public void attack(Player player) {
        int attackDamage = this.spell.getValue();
        player.takeDamage(attackDamage);
    }

    public void takeDamage(int damage){
        if(creature.hp > 0 ){
            creature.hp -= damage;
            if(creature.hp < 0){
                creature.hp =0;
            }
        }else{
            this.hp -= damage;
        }
    }
}
