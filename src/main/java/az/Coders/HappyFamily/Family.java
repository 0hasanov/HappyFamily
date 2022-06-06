package az.Coders.HappyFamily;

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

    public boolean deleteChild(int index) {
        if (index >= 0 && index < this.children.length) {
            Human[] newChildren = new Human[this.children.length - 1];

            for (int i = 0, j = 0; i < this.children.length; i++) {
                if (index != i) newChildren[j++] = this.children[i];
            }
            this.children = newChildren;
            return true;
        } else {
            return false;
        }
    }

    public int countFamily() {
        return 2 + this.children.length;
    }

    public String toString() {
        return String.format("Human{name = %s, surname = %s ,year = %d , iq = %d , mother = %s , father = % s , pet = %s ", getName(), getSurname(), getYear(), getIq(), mother, father, pet);
    }


}

