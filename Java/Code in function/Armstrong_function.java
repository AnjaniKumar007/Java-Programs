

import java.util.Scanner;

public class Armstrong_function {
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Ennter you number :");
            int n = in.nextInt();
            boolean ans = isArmstrom(n);
            System.out.print(ans);
        }
    }
    static boolean isArmstrom(int n){
        int orignal = n;
        int sum = 0;
        while (n>0){
            int rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n / 10;
            
        }
        return sum == orignal;
    }
}