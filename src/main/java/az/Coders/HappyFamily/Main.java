package az.Coders.HappyFamily;

public class Main {


    public static void main(String[] args) {
        Pet Alf = new Pet("CAT", "Alf");

        Pet Keddy = new Pet("DOG", "Keddy", (byte) 3, (byte) 20, new String[]{"jump", "lick"});

        Human father = new Human("Ayaz","Baxalov",(short)1980);
        Human mother  = new Human("Kydea","Baxalova",(short)1985);

        Human boy = new Human("Tenz","Baxalov",(short)2008,(byte)140,"Keddy","Kydea","Tenz",new String[][]{"speak"}{"walking"});
        boy.setPet(Keddy);
        boy.setMother(mother);
        boy.setFather(father);

        System.out.println(boy);
        System.out.println(boy.getPet().getNickname());
        System.out.println(boy.getFather().getYear());
        System.out.println(Human.class);

    }
}
