import java.util.HashMap;
import java.util.Map;

public class BeverageSelect {
    private Map<Integer, IBeverage> beverageOptions;

    public BeverageSelect() {
        beverageOptions = new HashMap<>();
        beverageOptions.put(1, new Espresso());
        beverageOptions.put(2, new Latte());
        beverageOptions.put(3, new Cappuccino());
    }

    public IBeverage getBeverage(int choice) {
        return beverageOptions.get(choice);
    }

    public void displayBeverageOptions() {
        System.out.println("Choose your beverage:");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Cappuccino");
    }
}
