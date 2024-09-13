import java.util.Scanner;

public class BankAccount {
    static float balance = 5000.0f;
    static float interestRate = 1.12f;
    public static void main(String[] args) {
        add_interest();
        get_balance();
        add_interest();
        get_balance();
        add_interest();
        get_balance();


    }
    public static void add_interest(){
        balance *= interestRate;
    }
    public static void get_balance(){
        System.out.println(balance);
    }
}
