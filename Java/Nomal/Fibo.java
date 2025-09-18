import java.util.Scanner;
public class Fibo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        long n = in.nextInt();
        long a = 0 , b = 1;
        
        for (long i = 1 ; i<=n ; i++){
            
            System.out.println(a);
            long c = a + b;
            a = b;
            b = c;
            
            
        }
        
    }
}
