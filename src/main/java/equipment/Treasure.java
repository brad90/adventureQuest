package equipment;

public enum Treasure {

    GOLD(100),
    APPLESHARES(200);


    private final int value;
    Treasure(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
