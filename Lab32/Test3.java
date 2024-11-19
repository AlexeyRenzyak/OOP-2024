import java.util.Vector;

public class Test3 {
    public static void main(String[] args) {
        Vector<Account> accounts = new Vector<>();
        Account a1 = new Account(1);
        SavingsAccount a2 = new SavingsAccount(2, 0.05);
        CheckingAccount a3 = new CheckingAccount(3);
        accounts.add(a1);
        accounts.add(a2);
        accounts.add(a3);
        Bank b = new Bank(accounts);
        a1.deposit(100);
        a2.deposit(200);
        a3.deposit(300);
        a3.withdraw(1);
        a3.withdraw(1);
        a3.withdraw(1);
        b.update();
        b.closeAccount(3);
        b.openAccount(1, "Account");
        b.openAccount(4, "Savings");
        b.update();
    }
}
