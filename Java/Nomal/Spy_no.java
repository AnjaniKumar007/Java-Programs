
import java.util.Scanner;

public class Spy_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = in.nextInt();
        int sum = 0;
        int product = 1;
        while(n>0){
            int rem  = n % 10;
            sum  += rem;
            product *= rem;
            n /= 10;
        }
        if(product == sum){
            System.out.println("The given number is Spy number");
        }
        else{
            System.out.println("The given number is not Spy number");
        }

    }
}
