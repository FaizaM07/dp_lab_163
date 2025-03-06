class TransferCommand implements Command {
    private BankAccount fromAccount;
    private BankAccount toAccount;
    private double amount;

    public TransferCommand(BankAccount fromAccount, BankAccount toAccount, double amount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        if (amount <= 0) {
            System.out.println("[ERROR] Invalid transfer amount!");
            return;
        }
        if (fromAccount.transfer(toAccount, amount)) {
            EventManager.publishEvent("Transferred " + amount + " from " + fromAccount.getAccountNumber() + " to "
                    + toAccount.getAccountNumber());
        } else {
            EventManager.publishEvent(
                    "Failed transfer from " + fromAccount.getAccountNumber() + " to " + toAccount.getAccountNumber());
        }
    }
}