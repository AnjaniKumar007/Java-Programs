import java.util.Scanner;

public class prime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to check wether no is prime or not :");
        int n = input.nextInt();
        if (n<=1){
            System.out.println("The number is not prime nor composite");
            return;
        }
        
        int i = 2;
        while (i <= Math.sqrt(n)){
            if (n%i == 0){
                System.out.println("Not a prime number");
                return;
            }
            i++;
        
        }
        System.out.println("Number is prime");
        

    }
}