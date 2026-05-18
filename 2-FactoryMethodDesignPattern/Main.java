

public class Main {

    public static void main(String[] args) {


        Resturant beefBurgerRest = new BeefBurgerResturant();
        Burger beef = beefBurgerRest.orderBurger();

        Resturant veggieBurgerRest = new VeggieBurgerResturant();
        Burger veggiw = veggieBurgerRest.orderBurger();

        Resturant chickenBurgerRest = new ChickenBurgerResturant();
        Burger chicken = chickenBurgerRest.orderBurger();

    }

}