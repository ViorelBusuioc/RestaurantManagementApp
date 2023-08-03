public class Burger {

    private double price;
    private String type;
    private String topping = "";

    public Burger() {
        type = "Beef";
        calculatePrice();
    }

    public Burger(String type) {
        this.type = type;
        calculatePrice();
    }

    public void calculatePrice() {
        switch (type) {
            case "Beef" -> price += 10;
            case "Pig" -> price += 8;
            case "Chicken" -> price += 6;
        }
    }

    public void addTopping(String topping) {
        this.topping += topping;
            switch (topping) {
                case "Cheese" -> price += 1.5;
                case "Pickles" -> price += 1.5;
                case "Onions" -> price += 1.0;
            }
    }

    public void addDeluxeTopping(String topping) {
        this.topping += topping;
        switch (topping) {
            case "Cheese" -> price += 0;
            case "Pickles" -> price += 0;
            case "Onions" -> price += 0;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTopping() {
        return topping;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " +
                "price='" + price + "'" +
                ", type='" + type + '\'' +
                ", topping='" + topping + "'.";
    }
}

class DeluxeBurger extends Burger {

    public DeluxeBurger(String type, String topping1) {
        super(type);
        addDeluxeTopping(topping1);
    }

    public DeluxeBurger(String type, String topping1, String topping2) {
        super(type);
        addDeluxeTopping(topping1);
        addDeluxeTopping(topping2);
    }

    public DeluxeBurger(String type, String topping1, String topping2, String topping3) {
        super(type);
        addDeluxeTopping(topping1);
        addDeluxeTopping(topping2);
        addDeluxeTopping(topping3);
    }

    public DeluxeBurger(String type, String topping1, String topping2, String topping3, String topping4) {
        super(type);
        addDeluxeTopping(topping1);
        addDeluxeTopping(topping2);
        addDeluxeTopping(topping3);
        addDeluxeTopping(topping4);
    }

    public DeluxeBurger(String type, String topping1, String topping2, String topping3, String topping4,
                        String topping5) {
        super(type);
        addDeluxeTopping(topping1);
        addDeluxeTopping(topping2);
        addDeluxeTopping(topping3);
        addDeluxeTopping(topping4);
        addDeluxeTopping(topping5);
    }

    @Override
    public void calculatePrice() {
        switch (getType()) {
            case "Beef" -> setPrice(14);
            case "Pig" -> setPrice(12);
            case "Chicken" -> setPrice(10);
        }
    }


}
