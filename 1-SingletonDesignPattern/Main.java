


public class Main {

    public static void main(String[] args) {

        Singletone s1 = Singletone.getInstance("2024-06-01");
        Singletone s2 = Singletone.getInstance("2024-06-02");


        System.out.println(s1.getDate());
        s1.setDate("2024-06-03");
        System.out.println(s2.getDate());

    }

}