import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a coefficient: ");
        double a = Double.parseDouble(input.nextLine());
        System.out.print("b coefficient: ");
        double b = Double.parseDouble(input.nextLine());
        System.out.print("c coefficient: ");
        double c = Double.parseDouble(input.nextLine());
        double D = b*b - 4*a*c;
        if (D < 0) {
            System.out.println("ERROR! Negative D");
            return;
        }
        else if (D == 0) {
            System.out.print("Single solution: " + Double.toString(-b/(2*a)));
            return;
        }
        else {
            System.out.print("Solution 1: " + Double.toString((-b+Math.sqrt(D))/(2*a)));
            System.out.print("\nSolution 2: " + Double.toString((-b-Math.sqrt(D))/(2*a)));
        }

    }
}
