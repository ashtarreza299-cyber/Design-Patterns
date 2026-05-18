
public abstract class Resturant {

    public Burger orderBurger() {


        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    abstract Burger createBurger();
}
