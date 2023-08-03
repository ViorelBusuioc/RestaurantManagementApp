public class SideItem {

    private double price;
    private String type;
    private String size;

    public SideItem() {
        type = "Fries";
        size = "M";
        calculatePrice();
        changeSize();
    }

    public SideItem(String type, String size) {
        this.type = type;
        this.size = size;
        calculatePrice();
        changeSize();
    }

    public void calculatePrice() {
        switch (type) {
            case "Fries" -> price += 2.5;
            case "Rice" -> price += 2.5;
            case "Salad" -> price += 2.0;
        }
    }

    public void changeSize() {
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
        return "SideItem: " +
                "price=" + price +
                ", type='" + type + '\'' +
                ", size='" + size;
    }
}
