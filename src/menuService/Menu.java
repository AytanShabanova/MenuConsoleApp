package menuService;

public class Menu {
    private int number;
    private   String product;
    private  double price;

    public Menu(int number,String product, double price) {
        this.product = product;
        this.price = price;
        this.number=number;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "number=" + number +
                ", product='" + product + '\'' +
                ", price=" + price +
                '}';
    }
}
