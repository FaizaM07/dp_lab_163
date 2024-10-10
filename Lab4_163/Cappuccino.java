public class Cappuccino implements IBeverage {
    @Override
    public String getDescription() {
        return "Cappuccino";
    }

    @Override
    public double cost() {
        return 450;
    }
}