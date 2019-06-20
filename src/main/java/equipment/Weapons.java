package equipment;

public enum Weapons {


    SWORD(10),
    AXE(20);


    private final int value;
    Weapons(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
