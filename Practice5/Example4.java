import java.util.*;

public class Example4 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      StringTokenizer tokenizer2 = new StringTokenizer(in.nextLine(), " ");
      while (tokenizer2.hasMoreTokens()) {
         double leftOperand, result, rightOperand;
         String leftString, operator, rightString;
         StringTokenizer tokenizer;

         tokenizer = new StringTokenizer(tokenizer2.nextToken(), "+-/*", true);

         try {
            leftString = tokenizer.nextToken();
            operator = tokenizer.nextToken();
            rightString = tokenizer.nextToken();

            try {
               leftOperand = Double.parseDouble(leftString);
            } catch (NumberFormatException e) {
               System.out.println("Left operand is not a number");
               return;
            }
            try {
               rightOperand = Double.parseDouble(rightString);
            } catch (NumberFormatException e) {
               System.out.println("Right operand is not a number");
               return;
            }
            if (operator.equals("+"))
               result = leftOperand + rightOperand;
            else if (operator.equals("-"))
               result = leftOperand - rightOperand;
            else if (operator.equals("*"))
               result = leftOperand * rightOperand;
            else if (operator.equals("/"))
               result = leftOperand / rightOperand;
            else
               result = 0.0;

            System.out.println("Result: " + result);
         } catch (NoSuchElementException nsee) {
            System.out.println("Invalid syntax");
         }
      }
   }
}
