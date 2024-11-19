public class Account{
    protected double balance;
    private int accNumber;
    public Account(int a){
        balance = 0.0;
        accNumber = a;
    }
    public void deposit(double sum) {
        balance += sum;
    }
    public void withdraw(double sum) {
        if (balance >= sum) {
            balance -= sum;
        }
    }
    public double getBalance() {
        return balance;
    }
    public int getAccountNumber() {
        return accNumber;
    }
    public void transfer(double amount, Account other) {
        if (balance >= amount) {
            other.deposit(balance - amount);
            balance -= amount;
        }
    }
    public String toString() {
        return "Account number: " + accNumber + "\nBalance: " + balance;
    }
    public final void print() {
        System.out.println(toString());
    }
}