import java.util.Scanner;

public class prime_between_no {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter the numbers :");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
           Prime(num1 , num2);
        }
    }
    static int Prime(int a , int b){
        for (int i = a ; i<=b ; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
        return b;
        
    }
    static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i = 2 ; i*i <= n ; i++){
            if (n % i == 0){
                return false;
            }
            
        }
        return true;
    }
}
