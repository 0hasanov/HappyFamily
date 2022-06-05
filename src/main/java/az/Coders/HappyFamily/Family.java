package az.Coders.HappyFamily;

import java.util.Random;
import java.util.Scanner;

public class Family extends Human {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;


    public Family() {

    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {

        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }
    static {
        System.out.println("Family class is loading");
    }

    {
        deleteChild();
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    public void deleteChild(Human children) {

    }

    public void toWelcomeTheFavourite() {
        System.out.println("to welcome the favourite");
    }

    public void toDescribeTheFavourite() {
        System.out.println("to describe the favourite");
    }

    public void toFeed() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random(101);
        if (pet.getTrickLevel() < random) {
            System.out.printf("Hm... I will feed Jack's %s", pet.getNickname());
        } else {
            System.out.printf("I think Jack's %s  is not hungry.", pet.getNickname());
        }
    }

    public String toString() {
        return String.format("Human{name = %s, surname = %s ,year = %d , iq = %d , mother = %s , father = % s , pet = %s ", getName(), getSurname(), getYear(), getIq(), mother, father, pet);
    }


}

