package equipment;

public enum Armour {

    MEATSHEILD(0.05),
    STEELARMOUR(0.5);


    private final double value;
    Armour(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
