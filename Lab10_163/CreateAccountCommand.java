class CreateAccountCommand implements Command {
    private BankRepository bankRepository;
    private String accountNumber;
    private String owner;
    private double initialDeposit;

    public CreateAccountCommand(BankRepository bankRepository, String accountNumber, String owner,
            double initialDeposit) {
        this.bankRepository = bankRepository;
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.initialDeposit = initialDeposit;
    }

    @Override
    public void execute() {
        if (bankRepository.getAccount(accountNumber) != null) {
            System.out.println("[ERROR] Account with this number already exists!");
            return;
        }
        BankAccount account = new BankAccount(accountNumber, owner, initialDeposit);
        bankRepository.addAccount(account);
        EventManager.publishEvent("Account created: " + accountNumber);
    }
}