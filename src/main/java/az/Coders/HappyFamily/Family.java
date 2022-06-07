package az.Coders.HappyFamily;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Random;

public class Family extends Human {
    private Human mother;
    private Human father;
    private Human[] children = {};
    private Pet pet;

    public Family() {

    }

    public Family(Human mother, Human father) {
        this.father = mother;
        this.mother = father;
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
        System.out.println("********");
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

    public void toWelcomeTheFavourite() {
        System.out.println("to welcome the favourite");
    }

    public void toDescribeTheFavourite() {
        System.out.println("to describe the favourite");
    }

    public void greetPet() {
        System.out.printf("Hello, %s", pet.getNickname());
    }

    public void describePet() {
        System.out.printf("I have a %s, he is %d years old, he is %s",
                pet.getSpecies(), pet.getAge(), pet.getTrickLevel() > 50 ? "very sly" : "almost not sly");
    }


    public void toFeed() {
        Random random = new Random(101);
        if (pet.getTrickLevel() < random.nextInt()) {
            System.out.printf("Hm... I will feed Jack's %s", pet.getNickname());
        } else {
            System.out.printf("I think Jack's %s  is not hungry.", pet.getNickname());
        }
    }

    public void addChild(Human child) {
        Human[] newChildren = Arrays.copyOf(this.children, this.children.length + 1);

        newChildren[this.children.length] = child;

        this.children = newChildren;

    }


    public int countFamily() {
        return 2 + this.children.length;
    }


    public String toString() {
        return String.format("Human{name = %s, surname = %s ,year = %d , iq = %d , mother = %s , father = % s , pet = %s ", getName(), getSurname(), getYear(), getIq(), mother, father, pet);
    }


}

