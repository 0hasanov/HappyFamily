package az.Coders.HappyFamily;

public class Main {


    public static void main(String[] args) {
        System.out.println("Yang Guang");
        Pet dog = new Dog();
        dog.setSpecies(ESpecies.PANDA);
        dog.setNickname("Yang Guang");
        dog.setAge((byte) 18);
        System.out.println(dog);


        System.out.println("Berk");

        Human berk = new Human();
        berk.setName("Berk");
        berk.setSurname("Tepe");
        berk.setYear((short)1998);
        berk.setSchedule(EDayOfWeek.Tuesday);
        System.out.println(berk.getSchedule().getDaysByNumber());
        System.out.println(berk);



        System.out.println("Keddy");
        Pet cat = new DomesticCat();
//        ESpecies.CAT, "Keddy", (byte) 1, (byte) 45, new String[]{"jump", "lick"}
        cat.setSpecies(ESpecies.CAT);
        cat.setNickname("Keddy");
        cat.setAge((byte)1);
        cat.setTrickLevel((byte)45);
        cat.setHabits(new String[]{"jump","lick"});

        System.out.println(cat);

        System.out.println("Father_Mother");
        Human father = new Human("Ayaz", "Baxalov", (short) 1980, (byte) 100, EDayOfWeek.Friday); //new String[][]{{"day1", "week1"}, {"day2", "week2"}});
        Human mother = new Human("Kydea", "Baxalova", (short) 1985, (byte) 95, EDayOfWeek.Monday); //new String[][]{{"day1", "week1"}, {"day2", "week2"}});
        System.out.println(father);
        System.out.println(mother);

        System.out.println("Children");
        Human boy = new Human("Tenz", "Baxalov", (short) 2007);
        Human girl = new Human("Lil", "Baxalova", (short) 2009);
        System.out.println(boy);

        System.out.println("FamilyOne");
        Family familyOne = new Family(mother, father);
        familyOne.addChild(boy);
        System.out.println(familyOne);
        familyOne.addChild(girl);
        System.out.println(familyOne);
        System.out.println(familyOne.countFamily());


    }
}
