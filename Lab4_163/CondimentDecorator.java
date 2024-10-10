public abstract class CondimentDecorator implements IBeverage {
    protected IBeverage beverage;

    public CondimentDecorator(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}