package az.Coders.HappyFamily;

import java.util.Arrays;

public class Family extends Human {
    private Human mother;
    private Human father;
    private Human children;
    private Pet pet;

    private Family family;

    public Family() {

    }

    public Family(Human mother, Human father, Human children, Pet pet,Family family) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
        this.family = family;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", year=" + getYear() +
                ", iq=" + getIq() +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(getSchedule()) +
                '}';

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

    public Human getChildren() {
        return children;
    }

    public void setChildren(Human children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Family getFamily(){
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }


    public void deleteChild(Human children) {

    }

    public void to_welcome_the_favourite(){
        System.out.println("to welcome the favourite");
    }
    public void to_describe_the_favourite(){
        System.out.println("to describe the favourite");
    }

    public void to_feed(){
        System.out.println("to feed");

    }


}
