public class Main {

    public static void main(String[] args) {

//        Burger burger = new Burger("Beef");
//        burger.addTopping("Cheese");
//        burger.addTopping("Onions");
//        System.out.println(burger);
//
//        Burger deluxeBurger = new DeluxeBurger("Beef","Cheese","Onions");
//        System.out.println(deluxeBurger);
//
//        Drink drink = new Drink();
//        System.out.println("Price of the default drink is (Cola size M):  " + drink.getPrice());
//        Drink drink1 = new Drink("Nestea","XL");
//        System.out.println("Price of the Nestea XL is: " + drink1.getPrice());
//
//        SideItem sideItem = new SideItem();
//        System.out.println("Price of the default sideItem is (Fries size M): " + sideItem.getPrice());
//        SideItem sideItem1 = new SideItem("Rice","S");
//        System.out.println("Price of the Rice size S is: " + sideItem1.getPrice());

//        MealOrder order = new MealOrder(new DeluxeBurger("Chicken","Cheese","Cheese"),
//                                        new Drink("Cola","M"),
//                                        new SideItem("Fries","XL"));
//        System.out.println(order);


//        Scanner s = new Scanner(System.in);
//        System.out.println("Please select your burger (Beef, Pig, Chicken): ");
//        String burger = s.nextLine();
//        System.out.println("Please select your topping (Cheese, Pickles, Onions): " );
//        String topping = s.nextLine();
//        System.out.println("Please select your drink (Cola, Fanta, Nestea): ");
//        String drink = s.nextLine();
//        System.out.println("Please select your drink size (S, M, L, XL): ");
//        String drinkSeize = s.nextLine();
//        System.out.println("Please select your side dish (Fries, Rice, Lettuce): ");
//        String sideItem = s.nextLine();
//        System.out.println("Please select your side dish size (S, M, L, XL): ");
//        String sideItemSize = s.nextLine();
//        MealOrder order = new MealOrder(new Burger(burger),
//                                        new Drink(drink,drinkSeize),
//                                        new SideItem(sideItem,sideItemSize));
//        order.burger.addTopping(topping);
//        System.out.println(order.toString() +
//                            "\nPlease touch to Pay");

//        MealOrder order2 = new MealOrder(new Burger("Beef"),"Cheese", "Pickles", "Onions",
//                                        new Drink("Cola","S"),
//                                        new SideItem("Fries","L"));
//        System.out.println(order2);

        MealOrder order4 = new MealOrder(new DeluxeBurger("Beef", "Cheese", "Cheese",
                                        "Pickles"),
                                        new Drink("Nestea", "M"),
                                        new SideItem("Salad","XL"));
        order4.burger.addTopping("Onions");
        System.out.println(order4);

    }
}
