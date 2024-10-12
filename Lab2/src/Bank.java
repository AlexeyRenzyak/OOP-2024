import java.util.Vector;

public class Bank {
    public double basicInterestRate = 0.05;
    Vector<Account> accounts;
    public Bank(Vector<Account> accounts) {
        this.accounts = accounts;
    }
    public void update(){
        for (int i = 0; i < accounts.size(); i++) {
            Account a = accounts.get(i);
            if(a instanceof SavingsAccount) {
                ((SavingsAccount) a).calculateInterest();
            } else if (a instanceof CheckingAccount) {
                if (((CheckingAccount) a).getTransactions() > ((CheckingAccount) a).getFreeTransactions()) {
                    ((CheckingAccount) a).deductFee(((CheckingAccount) a).getTransactions()-((CheckingAccount) a).getFreeTransactions());
                    ((CheckingAccount) a).setFreeTransactions(((CheckingAccount) a).getTransactions());
                }
            }
            a.print();
        }
    }
    public void openAccount(int a, String type){
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == a) {
                System.out.println("Account number is already in use");
                return;
            }
        }
        if (type.equals("Savings")) {
            accounts.add(new SavingsAccount(a, basicInterestRate));
        }
        if (type.equals("Checking")) {
            accounts.add(new CheckingAccount(a));
        }
        if (type.equals("Account")) {
            accounts.add(new Account(a));
        }
        System.out.println("Account is opened");
    }
    public void closeAccount(int a){
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == a) {
                accounts.remove(i);
                System.out.println("Account is closed");
                return;
            }
        }
        System.out.println("Account is nonexistent");
    }
}
