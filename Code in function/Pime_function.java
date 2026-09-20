
import java.util.Scanner;

public class Pime_function {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
        System.out.print("Enter your number :");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
            
        }
        
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