package player;

import behaviour.IAttack;
import equipment.Armour;
import equipment.Weapons;

public class Warrior extends Player implements IAttack {


    private Weapons weapon;
    private Armour armour;

    public Warrior(String name, int hp, Weapons weapon, Armour armour) {
        super(name, hp);
        this.weapon = weapon;
        this.armour = armour;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public Armour getArmour() {
        return armour;
    }

    public void attack(Player player) {
        int attackDamage = this.weapon.getValue();
        player.takeDamage(attackDamage);
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
    }
}
