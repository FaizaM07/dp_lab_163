import java.util.ArrayList;
import java.util.List;

public abstract class Bundle implements IProduct {
    public String name;
    public String description;
    public double discount;
    protected List<IProduct> products = new ArrayList<>();

    public Bundle(String name, String description, double discount) {
        this.name = name;
        this.description = description;
        this.discount = discount;
    }

    public void addProduct(IProduct product) {
        products.add(product);
    }

    //public void removeProduct(IProduct product) {
      //  products.remove(product);
    //}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (IProduct product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice * (1 - discount); // Apply discount
    }

    @Override
    public void display() {
        System.out.println("Bundle: " + name + " , Description: " + description + " , Discount: " + (discount * 100) + "%");
        for (IProduct product : products) {
            product.display();
        }
        System.out.println("Total Price for Bundle: BDT " + getPrice());
    }
}
