class BankAccount {
  private String accountNumber;
  private String owner;
  private double balance;
  private List<String> transactionHistory;

  
  public BankAccount(String accountNumber, String owner, double initialDeposit) {
      this.accountNumber = accountNumber;
      this.owner = owner;
      this.balance = initialDeposit;
      this.transactionHistory = new ArrayList<>();
      addTransaction("Account created with initial deposit: " + initialDeposit);
  }

  public void deposit(double amount) {
      balance += amount;
      addTransaction("Deposited: " + amount);
  }

  public boolean withdraw(double amount) {
      if (balance >= amount) {
          balance -= amount;
          addTransaction("Withdrawn: " + amount);
          return true;
      } else {
          addTransaction("Failed withdrawal attempt: " + amount + " (Insufficient funds)");
          return false;
      }
  }

  public boolean transfer(BankAccount recipient, double amount) {
      if (this.withdraw(amount)) {
          recipient.deposit(amount);
          addTransaction("Transferred: " + amount + " to " + recipient.getAccountNumber());
          recipient.addTransaction("Received: " + amount + " from " + this.getAccountNumber());
          return true;
      }
      return false;
  }

  public double getBalance() {
      return balance;
  }

  public String getAccountNumber() {
      return accountNumber;
  }

  public String getOwner() {
      return owner;
  }

  public List<String> getTransactionHistory() {
      return transactionHistory;
  }

  private void addTransaction(String message) {
      transactionHistory.add(message);
  }
}
