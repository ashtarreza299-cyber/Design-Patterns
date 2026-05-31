

public class Computer {

    int id;
    String model;
    String color;
    String company;
    int generation;
    int corei;
    int coreNumbers;
    int ssd;
    int ram;
    int graphic;
    boolean isTouch;
    boolean keyboardLight;


    private Computer(Builder builder) {

        this.id = builder.id;
        this.model = builder.model;
        this.color = builder.color;
        this.company = builder.company;
        this.generation = builder.generation;
        this.corei = builder.corei;
        this.coreNumbers = builder.coreNumbers;
        this.ssd = builder.ssd;
        this.ram = builder.ram;
        this.graphic = builder.graphic;
        this.isTouch = builder.isTouch;
        this.keyboardLight = builder.keyboardLight;


    }

    public static class Builder implements BuilderInterface {

        int id;
        String model;
        String color;
        String company;
        int generation;
        int corei;
        int coreNumbers;
        int ssd;
        int ram;
        int graphic;
        boolean isTouch;
        boolean keyboardLight;


        @Override
        public void id(int id) {this.id = id;}

        @Override
        public void model(String model) {this.model = model;}

        @Override
        public void company(String company) {this.company = company;}

        @Override
        public void generation(int generation) {this.generation = generation;}

        @Override
        public void color(String color) {this.color = color;}

        @Override
        public void corei(int corei) {this.corei = corei;}

        @Override
        public void coreNumbers(int coreNumbers) {this.coreNumbers = coreNumbers;}

        @Override
        public void ssd(int ssd) {this.ssd = ssd;}

        @Override
        public void ram(int ram) {this.ram = ram;}

        @Override
        public void graphic(int graphic) {this.graphic = graphic;}

        @Override
        public void isTouch(boolean isTouch) {this.isTouch = isTouch;}

        @Override
        public void keyboardLight(boolean keyboardLight) {this.keyboardLight = keyboardLight;}

        public Computer build() {
            return new Computer(this);
        }

    }

    @Override
    public String toString() {
        return "Computer{" +
                "\n\tid=" + id +
                ",\n\t model='" + model + '\'' +
                ",\n\t color='" + color + '\'' +
                ",\n\t company='" + company + '\'' +
                ",\n\t generation=" + generation +
                ",\n\t corei=" + corei +
                ",\n\t coreNumbers=" + coreNumbers +
                ",\n\t ssd=" + ssd +
                ",\n\t ram=" + ram +
                ",\n\t graphic=" + graphic +
                ",\n\t isTouch=" + isTouch +
                ",\n\t keyboardLight=" + keyboardLight +
                "\n}";
    }
}

