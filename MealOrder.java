public class MealOrder {

    Burger burger;
    Drink drink;
    SideItem sideItem;
    double price;

    public MealOrder() {
        this.burger = new Burger();
        this.drink = new Drink();
        this.sideItem = new SideItem();
    }

    public MealOrder(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public MealOrder(Burger burger, String topping1, Drink drink, SideItem sideItem) {
        this.burger = burger;
        burger.addTopping(topping1);
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public MealOrder(Burger burger, String topping1, String topping2, Drink drink, SideItem sideItem) {
        this.burger = burger;
        burger.addTopping(topping1);
        burger.addTopping(topping2);
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public MealOrder(Burger burger, String topping1, String topping2, String topping3, Drink drink, SideItem sideItem) {
        this.burger = burger;
        burger.addTopping(topping1);
        burger.addTopping(topping2);
        burger.addTopping(topping3);
        this.drink = drink;
        this.sideItem = sideItem;
    }

    public double getPrice() {
         price += burger.getPrice();
         price += drink.getPrice();
         price += sideItem.getPrice();
         return price;
    }

    @Override
    public String toString() {
        return "Order Total: " + getPrice() + "\n" +
                burger.toString() + "\n" +
                drink.toString() + "\n" +
                sideItem.toString() + "\n" +
                "-".repeat(40);
    }
}
