public class Drink {

    private double price;
    private String type;
    private String size;

    public Drink() {
        calculatePrice("Cola");
        changeSize("M");
    }

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        calculatePrice(type);
        changeSize(size);
    }

    public void calculatePrice(String type) {
        this.type = type;
        switch (type) {
            case "Cola" -> price += 2.5;
            case "Fanta" -> price += 2.5;
            case "Nestea" -> price += 2.0;
        }
    }

    public void changeSize(String size) {
        this.size = size;
        switch (size) {
            case "S" -> price -= 0.5;
            case "M" -> price += 0.0;
            case "L" -> price += 0.5;
            case "XL" -> price += 1.0;
        }
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Drink: " +
                "price=" + price +
                ", type='" + type + '\'' +
                ", size='" + size;
    }
}
