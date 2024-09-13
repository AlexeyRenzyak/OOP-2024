import java.util.Scanner;
import java.lang.Math;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Side a of a square: ");
        double side = Double.parseDouble(input.nextLine());
        System.out.print("Area of a square: " + Double.toString(side*side) + "\n");
        System.out.print("Perimeter of a square: " + Double.toString(side*4) + "\n");
        System.out.print("Diagonal of a square: " + Double.toString(side*Math.sqrt(2.0)) + "\n");

    }
}
