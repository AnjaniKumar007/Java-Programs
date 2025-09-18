
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter Your First Numer :");
            int num1 = input.nextInt();
            System.out.print("Enter Your Second Numer :");
            int num2 = input.nextInt();
            System.out.print("Enter Your Operation (+, -, *, /) :");
            char op = input.next().charAt(0);
            if (op == '+'){
                System.out.println("The Sum of Your Number is : " + (num1 + num2));
            }
            else if (op == '-'){
                System.out.println("The Subtraction of Your Number is : " + (num1 - num2));
            }
            else if (op == '*'){
                System.out.println("The Multiplication of Your Number is : " + (num1 * num2));
            }
            else if (op == '/'){
                System.out.println("The Division of Your Number is : " + (num1 / num2));
            }
            else{
                System.out.println("Invalid Operation");
            }

        }
    }
    
}
