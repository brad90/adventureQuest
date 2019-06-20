package equipment;

public enum CookingIngredients {

    POTION(20),
    HERB(5);


    private final int value;
    CookingIngredients(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
