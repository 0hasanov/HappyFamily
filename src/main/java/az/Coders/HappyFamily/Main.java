package az.Coders.HappyFamily;

public class Main {


    public static void main(String[] args) {
        Pet cat = new Pet("cat", "Keddy", (byte) 1, (byte) 45, new String[]{"jump", "lick"});
        System.out.println(cat);
        Human father = new Human("Ayaz", "Baxalov", (short) 1980, (byte) 100, new String[][]{{"day1", "week1"}, {"day2", "week2"}});
        Human mother = new Human("Kydea", "Baxalova", (short) 1985, (byte) 95, new String[][]{{"day1", "week1"}, {"day2", "week2"}});
        System.out.println(father);
        System.out.println(mother);
        Human boy = new Human("Tenz", "Baxalov", (short) 2007);
        Human girl = new Human("Lil", "Baxalova", (short) 2009);

        System.out.println(boy);
        System.out.println("***********");
        Family familyOne = new Family(mother, father);
        /*familyOne.addChild(boy);
        System.out.println(familyOne);
        familyOne.addChild(girl);
        System.out.println(familyOne);
        System.out.println(familyOne.countFamily());
        */
        familyOne.removeElement(familyOne,boy);


    }
}
