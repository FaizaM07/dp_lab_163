public class Milk extends CondimentDecorator {
    public Milk(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 50 ;
    }
}