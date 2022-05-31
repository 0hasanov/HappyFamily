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
        System.out.printf("Hello, owner. I am %s. I miss you!", nickname);
    }

    private void foul() {
        System.out.println("I need to cover it up");
    }

        public String getSpecies () {
            return species;
        }

        public void setSpecies (String species){
            this.species = species;
        }

        public String getNickname () {
            return nickname;
        }

        public void setNickname (String nickname){
            this.nickname = nickname;
        }

        public short getAge () {
            return age;
        }

        public void setAge ( short age){
            this.age = age;
        }

        public byte getTricklevel () {
            return tricklevel;
        }

        public void setTricklevel ( byte tricklevel){
            this.tricklevel = tricklevel;
        }

        public String[] getHabits () {
            return habits;
        }

        public void setHabits (String[]habits){
            this.habits = habits;
        }

}