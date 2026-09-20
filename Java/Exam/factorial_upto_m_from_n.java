
import java.util.Scanner;

public class factorial_upto_m_from_n {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of M , N :");
        int M = in.nextInt(), N = in.nextInt();
        for(int i = M ; i<=N ; i++){
            long fac = 1;
            for(int j = 1 ; j<=i ; j++){
                fac = fac * j;
            }
            System.err.println("The factorial of "+ i +" : " + fac);
        }
        
    }
}
