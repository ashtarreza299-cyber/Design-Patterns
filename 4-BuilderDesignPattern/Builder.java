public class Builder implements BuilderInterface {


        Computer computer = new Computer.Builder().build();

        @Override
        public void id(int id) {computer.id = id;}

        @Override
        public void model(String model) {computer.model = model;}

        @Override
        public void company(String company) {computer.company = company;}

        @Override
        public void generation(int generation) {computer.generation = generation;}

        @Override
        public void color(String color) {computer.color = color;}

        @Override
        public void corei(int corei) {computer.corei = corei;}

        @Override
        public void coreNumbers(int coreNumbers) {computer.coreNumbers = coreNumbers;}

        @Override
        public void ssd(int ssd) {computer.ssd = ssd;}

        @Override
        public void ram(int ram) {computer.ram = ram;}

        @Override
        public void graphic(int graphic) {computer.graphic = graphic;}

        @Override
        public void isTouch(boolean isTouch) {computer.isTouch = isTouch;}

        @Override
        public void keyboardLight(boolean keyboardLight) {computer.keyboardLight = keyboardLight;}

        public Computer build() {
            return computer;
        }

}
