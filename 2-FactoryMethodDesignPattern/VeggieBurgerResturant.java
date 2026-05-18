
public class VeggieBurgerResturant extends Resturant{


    @Override
    Burger createBurger() {

        return new VeggieBurger();
    }
}
