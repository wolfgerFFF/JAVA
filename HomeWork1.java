import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product {
    private String name;
    private double caps; //с volum-почему то ошибка!!!
    private int temperature;

    public Product(String name, double caps, int temperature) {
        this.name = name;
        this.caps = caps;
        this.temperature = temperature;
    }
    public String getName() {
        return name;
    }
    public double getCaps() {
        return caps;
    }
    public int getTemperature() {
        return temperature;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCaps(double caps) {
        this.caps = caps;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        return "Product { name=" + name + ", caps=" + caps + ", temperature=" + temperature + '}';
    }
}

public class VendingMachine {
    private List<Product> products = new ArrayList<>();

    public void intProduct(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product p : products) {
            if (p.getName().equals(name)) {
                return p;
            }
       }
        return new Product("product is  undefined", 0,0);
    }
}
public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        List<Product> products = new ArrayList<>(Arrays.asList(new Product("latte", 4.2, 42),new Product("tea", 1.7, 45), new Product("cappuccino", 7.0, 6)));
        vendingMachine.intProduct(products);
        System.out.println(vendingMachine.getProduct("latte").toString());
        System.out.println(vendingMachine.getProduct("tea").toString());
        System.out.println(vendingMachine.getProduct("cappuccino").toString());
    }
}


