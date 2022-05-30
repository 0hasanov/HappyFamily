package az.HappyFamily;

private class Human {
    private String name;
    private String surname;
    private byte year;
    private short iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[] schedule;


    private Human() {

    }

    private Human(String name, String surname, byte year) {
        this.name = name;
        this.surname = surname;
        this.year = year;

    }

    private Human(String name, String surname, byte year, String father,String mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;



    public Human(String name, String surname, byte year, short iq, Pet pet, Human mother, Human father, String[] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }


    private void greetPet() {
        System.out.println("Hello,%s", pet.nickname);
    }

    private void describePet() {
        System.out.println("I have a %s,he is %d years old", pet.species, pet.age
                ? pet.tricklevel > 50"very sly" :"almost not sly");
    }

}
