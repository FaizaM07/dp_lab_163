import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankRepository bankRepository = new BankRepository();

        while (true) {
            System.out.println("\nBanking System:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. View Balance");
            System.out.println("6. View Transaction History");
            System.out.println("7. Exit");
            System.out.print("Select an option: ");

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("[ERROR] Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input
                continue;
            }

            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Create Account
                    System.out.print("Enter Account Number: ");
                    String accNum = scanner.nextLine();
                    System.out.print("Enter Owner Name: ");
                    String owner = scanner.nextLine();
                    System.out.print("Enter Initial Deposit: ");
                    double deposit = scanner.nextDouble();
                    new CreateAccountCommand(bankRepository, accNum, owner, deposit).execute();
                    break;

                case 2: // Deposit
                    System.out.print("Enter Account Number: ");
                    accNum = scanner.nextLine();
                    BankAccount acc = bankRepository.getAccount(accNum);
                    if (acc != null) {
                        System.out.print("Enter Deposit Amount: ");
                        double amt = scanner.nextDouble();
                        new DepositCommand(acc, amt).execute();
                    } else {
                        System.out.println("[ERROR] Account not found!");
                    }
                    break;

                case 3: // Withdraw
                    System.out.print("Enter Account Number: ");
                    accNum = scanner.nextLine();
                    acc = bankRepository.getAccount(accNum);
                    if (acc != null) {
                        System.out.print("Enter Withdraw Amount: ");
                        double amt = scanner.nextDouble();
                        new WithdrawCommand(acc, amt).execute();
                    } else {
                        System.out.println("[ERROR] Account not found!");
                    }
                    break;

                case 4: // Transfer
                    System.out.print("Enter Sender Account: ");
                    String sender = scanner.nextLine();
                    System.out.print("Enter Recipient Account: ");
                    String receiver = scanner.nextLine();
                    System.out.print("Enter Transfer Amount: ");
                    double transferAmt = scanner.nextDouble();
                    BankAccount from = bankRepository.getAccount(sender);
                    BankAccount to = bankRepository.getAccount(receiver);
                    if (from != null && to != null) {
                        new TransferCommand(from, to, transferAmt).execute();
                    } else {
                        System.out.println("[ERROR] One or both accounts not found!");
                    }
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}
