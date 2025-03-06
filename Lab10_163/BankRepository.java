import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class BankRepository {
    private Map<String, BankAccount> accounts = new HashMap<>();

    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public BankAccount getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public Collection<BankAccount> getAllAccounts() {
        return accounts.values();
    }
}