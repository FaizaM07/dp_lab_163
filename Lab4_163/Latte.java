public class Latte implements IBeverage {
    @Override
    public String getDescription() {
        return "Latte";
    }

    @Override
    public double cost() {
        return 500;
    }
}