import java.util.Scanner;

public class prime_for_loop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to check wether number is prime or not :");
        int n = input.nextInt();
        if (n<=1){
            System.out.println("The number is not prime nor composite");
            return;
        }
    
        for(int i = 2 ; i <= Math.sqrt(n); i++){
            // for(int i = 2 ; i <= n/2 ; i++){  alternative to Math.sqrt(n
            if (n%i == 0){
                System.out.println("Not a prime number");
                return;
            }
        
        }
        System.out.println("Number is prime");
        

    }
}