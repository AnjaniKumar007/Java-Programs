
import java.util.Scanner;

public class sum_of_digit_until_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        while(n>10){
            n = sumDigit(n);
        }
        System.out.println(n);
        
    }
    static int sumDigit(int n){
        int sum = 0;
        while(n>0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
