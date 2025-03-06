class WithdrawCommand implements Command {
    private BankAccount account;
    private double amount;

    public WithdrawCommand(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        if (amount <= 0) {
            System.out.println("[ERROR] Invalid withdrawal amount!");
            return;
        }
        if (account.withdraw(amount)) {
            EventManager.publishEvent("Withdrawn " + amount + " from account: " + account.getAccountNumber());
        } else {
            EventManager.publishEvent("Failed to withdraw " + amount + " from account: " + account.getAccountNumber());
        }
    }
}
