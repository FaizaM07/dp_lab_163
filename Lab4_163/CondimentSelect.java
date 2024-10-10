import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class CondimentSelect {
    private Map<Integer, Function<IBeverage, IBeverage>> condimentOptions;

    public CondimentSelect() {
        condimentOptions = new HashMap<>();
        condimentOptions.put(1, Milk::new);
        condimentOptions.put(2, Sugar::new);
        condimentOptions.put(3, WhippedCream::new);
    }

    public IBeverage addCondiment(int choice, IBeverage beverage) {
        return condimentOptions.get(choice).apply(beverage);
    }

    public void displayCondimentOptions() {
        System.out.println("Do you want to add condiments?");
        System.out.println("1. Milk (50 BDT)");
        System.out.println("2. Sugar (20 BDT)");
        System.out.println("3. Whipped Cream (80 BDT)");
        System.out.println("4. No more condiments");
    }
}
