package az.HappyFamily;

public class Human {
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


    private Human(String ayaz) {

    }

    private Human(String name, String surname, byte year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    private Human(String name, String surname, byte year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.father = father;
        this.mother = mother;
    }

    private Human(String name, String surname, byte year, short iq, Pet pet, Human mother, Human father, String[] schedule) {
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
        System.out.printf("Hello,%s", pet.getNickname());
    }

    private void describePet() {
        System.out.printf("I have a %s,he is %d years old", pet.getSpecies(), pet.getAge());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public byte getYear() {
        return year;
    }

    public void setYear(byte year) {
        this.year = year;
    }

    public short getIq() {
        return iq;
    }

    public void setIq(short iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[] getSchedule() {
        return schedule;

    }
}

