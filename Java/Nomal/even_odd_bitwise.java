
import java.util.Scanner;

public class even_odd_bitwise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = in.nextInt();
        System.out.println(n + " is Odd : " + isOdd(n));
        
    }
    static boolean isOdd(int n){
        if((n & 1) == 0){
            return false;
        }
        return true;
    }
}
