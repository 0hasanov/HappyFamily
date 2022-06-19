package az.Coders.HappyFamily;

public enum ESpecies {
    CAT(false),
    DOG(false),
    PANDA(false),
    PARROT(true),
    FISH(false),
    FOX(false),
    LEON(false),
    EAGLE(true),
    UNKNOWN(false);


    private final boolean canFly;


    ESpecies(boolean canFly) {
        this.canFly = canFly;

    }

    public boolean isCanFly() {
        return canFly;
    }
}

