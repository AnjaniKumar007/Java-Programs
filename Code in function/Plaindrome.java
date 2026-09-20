
import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {
        try(Scanner in = new Scanner (System.in)){
            System.out.println("Enter the number You want to check :");
            int num = in.nextInt();
            Boolean result = Plaindrome(num);
            System.out.println(result);
        }
    }
    static boolean Plaindrome(int a){
        int Original = a;
        int Reverse = 0;
        while(a>0){
            Reverse = Reverse * 10 + a % 10;
            a = a/10;

        }
        return Reverse == Original;
    }
    
}
