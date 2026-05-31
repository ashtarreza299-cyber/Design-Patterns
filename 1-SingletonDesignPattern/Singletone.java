

public class Singletone {

    private static volatile Singletone instance;
    private String date;

    private Singletone(String date) {
        this.date = date;
    }

    public static Singletone getInstance(String date) {

        if (instance == null){  // Double checked locking -- to avoid unnecessary synchronization after the instance is initialized
            synchronized (Singletone.class) {
                if (instance == null)
                    instance = new Singletone(date);
            }
        }

        return instance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
