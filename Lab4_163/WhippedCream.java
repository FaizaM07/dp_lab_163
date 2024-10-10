public class WhippedCream extends CondimentDecorator {
    public WhippedCream(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whipped Cream";
    }

    @Override
    public double cost() {
        return beverage.cost() + 80 ;
    }
}