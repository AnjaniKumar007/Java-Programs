
import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int digitcount = 0;
        int original = n;
        int temp = n;
        while(temp>0){
            temp /= 10;
            digitcount++;
        }
        int sum = 0;
        temp = n;
        while(temp>0){
            int rem = temp % 10;
            sum += Math.pow(rem, digitcount);
            temp /= 10;
        }
        if(sum == original){
            System.out.println("The number is armstrong");
        }
        else{
            System.out.println("The number is not armstrong");
        }

    }
}