import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = in.nextInt();

        System.out.print("Enter second number: ");
        int second = in.nextInt();

        System.out.print("Enter third number: ");
        int step = in.nextInt();

        int sum = 0;

        for (int i = first; i <= second; i += step) {
            System.out.print(i + "   ");
            sum += i;
        }

        System.out.println("\nThe sum of number displayed is " + sum);
    }
}
