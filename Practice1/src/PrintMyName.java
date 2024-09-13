import java.util.Scanner;

public class PrintMyName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Name: ");
        String name = input.nextLine();
        int l = name.length();
        String caps = "+";
        for (int i = 0; i < l; i++) {
            caps += '-';
        }
        caps += '+';
        String nameline = "|"+name+"|";
        System.out.println(caps);
        System.out.println(nameline);
        System.out.println(caps);

    }
}
