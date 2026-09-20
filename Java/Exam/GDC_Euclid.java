import java.util.Scanner;

public class GCD_Euclid {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = in.nextInt();

        System.out.print("Enter the second number: ");
        int y = in.nextInt();

        int a = x;
        int b = y;

        // Euclid's Algorithm (iterative)
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD of " + x + " and " + y + " is " + a + ".");
    }
}