package az.Coders.HappyFamily.UserInterface;

import java.util.Scanner;

public class Username {
    private String name;
    private String surname;
    private String username;
    private String password;
    private short age;

    public Username() {
    }

    public Username(String name, String surname, String username, String password, short age) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public String getname() {

        return name;

    }

    public void setname(String name) {
        this.name = name;
    }

    public String getsurname() {
        return surname;
    }

    public void setsurname(String surname) {
        this.surname = surname;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public short getage() {
        return age;
    }

    public void setage(short age) {
        this.age = age;
    }

    public void options() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome " + name + surname);

        System.out.println("\n");

        switch () {
            case "firstoption": {
                System.out.printf("Please enter Username and Password : %s,%s", username, password);

            }
            case "secondoption": {
                System.out.printf("Please Add your data: %s , %s, %s, %s, %d ",name,surname,username,password,age);

            }
            case "thirdoption":{
                System.out.println("Exit");
            }
        }
    }
}
