class DepositCommand implements Command {
    private BankAccount account;
    private double amount;

    public DepositCommand(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        if (amount <= 0) {
            System.out.println("[ERROR] Invalid deposit amount!");
            return;
        }
        account.deposit(amount);
        EventManager.publishEvent("Deposited " + amount + " to account: " + account.getAccountNumber());
    }
}