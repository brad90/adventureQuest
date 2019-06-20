package equipment;

public enum Spells {

    FIREBALL(10),
    LIGHTNING(20);


    private final int value;
    Spells(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
