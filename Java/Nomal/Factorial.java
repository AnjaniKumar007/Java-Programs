import java.util.Scanner;

public class Factorial {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number which you want to get  factorial :");
        long n = input.nextInt();
        long f = 1;
        for (long i = 1 ; i<=n ; i++){
            f = f*i;
        }
        System.out.println("Factorial of " + n + " is: " + f);
        
    
    }
}
