package az.HappyFamily;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Human Tenz = new Human();
        Human Kydea = new Human();
        Human Ayaz = new Human("Ayaz","Baxalov",1985,"Tenz","Kydea");
        Ayaz.setMother(sc.next());
        System.out.println(Ayaz.getMother());

    }
}
