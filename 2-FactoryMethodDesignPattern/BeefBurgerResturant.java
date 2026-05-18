

public class BeefBurgerResturant extends Resturant{

    @Override
    Burger createBurger() {

        return new BeefBurger();
    }
}
