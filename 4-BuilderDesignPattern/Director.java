
public class Director {


    public Computer latitude5491(Builder builder) {

        builder.id(1);
        builder.model("Latitude 5491");
        builder.company("Dell");
        builder.generation(8);
        builder.color("Black");
        builder.corei(5);
        builder.coreNumbers(8);
        builder.ssd(512);
        builder.ram(16);
        builder.graphic(2);
        builder.isTouch(false);
        builder.keyboardLight(true);

        return builder.build();
    }

    public Computer macbookPro2020(Builder builder) {

        builder.id(2);
        builder.model("MacBook Pro");
        builder.company("Apple");
        builder.generation(10);
        builder.color("Space Gray");
        builder.corei(10);
        builder.coreNumbers(8);
        builder.ssd(512);
        builder.ram(16);
        builder.graphic(4);
        builder.isTouch(false);
        builder.keyboardLight(true);

        return builder.build();
    }

}
