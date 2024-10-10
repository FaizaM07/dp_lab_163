import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        BeverageSelect beverageSelect = new BeverageSelect();
        CondimentSelect condimentSelect = new CondimentSelect();


        System.out.println("Welcome to the Coffee Shop!");
        beverageSelect.displayBeverageOptions();
        int choice = scanner.nextInt();

        IBeverage beverage = beverageSelect.getBeverage(choice);
        if (beverage == null) {
            System.out.println("Invalid choice. Defaulting to Espresso.");
            beverage = new IBeverage() {
                @Override
                public String getDescription() {
                    return "";
                }

                @Override
                public double cost() {
                    return 0;
                }
            };
        }


        boolean addMore = true;
        while (addMore) {
            condimentSelect.displayCondimentOptions();
            int condimentChoice = scanner.nextInt();

            if (condimentChoice == 4) {
                addMore = false;
            } else if (condimentSelect.addCondiment(condimentChoice, beverage) != null) {
                beverage = condimentSelect.addCondiment(condimentChoice, beverage);
            } else {
                System.out.println("Invalid choice.");
            }
        }


        System.out.println("Your order: " + beverage.getDescription());
        System.out.printf("Total cost: %.2f BDT\n", beverage.cost());

        scanner.close();
    }
}
