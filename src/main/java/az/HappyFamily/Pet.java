package az.HappyFamily;

public class Pet {
    private String species;
    private String nickname;
    private short age;
    private byte tricklevel;
    private String[] habits;


    private Pet() {
    }

    private Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    private Pet(String species, String nickname, short age, byte tricklevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }

    private void eat() {
        System.out.println("I am eating");
    }

    private void respond() {
        System.out.println("Hello, owner. I am %s. I miss you!", nickname);
    }

    private void foul() {
        System.out.println("I need to cover it up");
    }

}
