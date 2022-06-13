package az.Coders.HappyFamily;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private short year;
    private byte iq;
    private EDayOfWeek schedule;

    static {
        System.out.println(Human.class.getName() + "Human class created");
    }

    {
        System.out.println(Human.class.getName() + "Object created");
    }



    public Human() {

    }

    public Human(String name, String surname, short year) {
        this.name = name;
        this.surname = surname;
        this.year = year;

    }

    public Human(String name, String surname, short year, byte iq, EDayOfWeek schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
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

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public byte getIq() {
        return iq;
    }

    public void setIq(byte iq) {
        this.iq = iq;
    }

    public EDayOfWeek getSchedule() {
        return schedule;
    }

    public void setSchedule(EDayOfWeek schedule) {
        this.schedule = schedule;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && schedule == human.schedule;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, schedule);
    }

    @Override
    public String toString() {

        return String.format("Human{name = %s, surname = %s ,year = %d , iq = %d, schedule = %s ", name, surname, year, iq,schedule);//Arrays.deepToString(schedule));
    }
}