public class SavingsAccount extends Account {
    private double interestRate;
    public SavingsAccount(int a, double interestRate) {
        super(a);
        this.interestRate = interestRate;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void calculateInterest() {
        deposit(interestRate*getBalance());
    }
    public String toString() {
        return "Account number: " + getAccountNumber() + "\nBalance: " + getBalance() + " (Savings)";
    }
}
