

public class ChickenBurgerResturant extends Resturant{

    @Override
    Burger createBurger() {
        return new ChickenBurger();
    }
}
