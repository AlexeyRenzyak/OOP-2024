import java.util.Scanner;

public class Palindromator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Your word: ");
        String w = input.nextLine();
        String rw = "";
        for (int i = w.length()-1; i != -1; i--) {
            rw += w.charAt(i);
        }
        if (rw.equals(w)) {
            System.out.println("Your word is palindrome");
        }
        else {
            System.out.println("Your word is not palindrome");
        }

    }
}
