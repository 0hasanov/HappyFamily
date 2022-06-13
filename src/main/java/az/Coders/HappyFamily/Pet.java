package az.Coders.HappyFamily;

import java.util.Arrays;

public class Pet {
    private ESpecies species;
    private String nickname;
    private byte age;
    private byte trickLevel;
    private String[] habits;

    static {
        System.out.println(Pet.class.getName() + "Pet class created");
    }

    {
        System.out.println(Pet.class.getName() + "Object created");
    }

    public Pet() {

    }

    public Pet(ESpecies species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(ESpecies species, String nickname, byte age, byte trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public ESpecies getSpecies() {
        return species;
    }

    public void setSpecies(ESpecies species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public byte getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(byte trickLevel) {
        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating'");
    }

    public void respond() {
        System.out.printf("Hello, owner. I am %s. I miss you!", this.nickname);
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return String.format("Pet{species = %s, nickname = %s, age = %d,trickLevel =%d,habits = %s", species,nickname,age,trickLevel,habits);
    }
}