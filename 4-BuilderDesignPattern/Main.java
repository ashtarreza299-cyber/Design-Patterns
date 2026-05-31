
public class Main {

    public static void main(String[] args) {


        Builder builder1 = new Builder();
        Director director1 = new Director();
        Computer latitude5491 = director1.latitude5491(builder1);
        System.out.println(latitude5491);

        Builder builder2 = new Builder();
        Director director2 = new Director();
        Computer macBookPro2020 = director2.macbookPro2020(builder2);
        System.out.println(macBookPro2020);

    }
}