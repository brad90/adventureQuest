package equipment;

public enum Armour {

    MEATSHEILD(5),
    STEELARMOUR(2);


    private final int value;
    Armour(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
