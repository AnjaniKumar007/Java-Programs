
import java.util.Scanner;

public class GDC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Value of X and Y :");
        int x = in.nextInt() , y = in.nextInt();
        while(y != 0){
            int r = x % y;
            x = y;
            y = r;
        }
        System.out.println("The gdc of the given number is : " + x);
    }
}
