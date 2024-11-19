public class CheckingAccount extends Account {

    private static int freeTransactions = 3;
    private int transactions = 0;
    public CheckingAccount(int a) {
        super(a);
    }
    public void deductFee(int t){
        balance -= t*0.02;
    }
    public int getFreeTransactions() {
        return freeTransactions;
    }
    public void setFreeTransactions(int freeTransactions) {
        this.freeTransactions = freeTransactions;
    }
    public int getTransactions() {
        return transactions;
    }
    public void deposit(double sum) {
        balance += sum;
        transactions += 1;
    }
    public void withdraw(double sum) {
        if (balance >= sum) {
            balance -= sum;
            transactions += 1;
        }
    }
    public String toString() {
        return "Account number: " + getAccountNumber() + "\nBalance: " + getBalance() + " (Checking)";
    }
}
