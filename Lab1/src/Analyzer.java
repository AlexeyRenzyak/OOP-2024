import java.util.Scanner;

public class Analyzer {
    static Scanner  input = new Scanner(System.in);
    static Data data = new Data();

    public static void analyze() {
        while (1==1) {
            System.out.print("Enter a number (Q to quit): ");
            String next = input.nextLine();
            if (next.equals("Q")){
                break;
            }
            try {
                double num = Double.parseDouble(next);
                data.addValue(num);
            }
            catch (NumberFormatException exc) {
                System.out.println("Invalid number, please try again");
            }
        }
        System.out.println("Average = " + Double.toString(data.getAverage()));
        System.out.println("Maximum = " + Double.toString(data.getMax()));
    }
}
