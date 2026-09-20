
import java.util.Scanner;

public class increasing_decreasing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a<b && a<c && b<c){
            System.out.println("Increasing");
        }
        else if (a>b && a>c &&  b>c){
            System.out.println("Decreasing");
        }
        else{
            System.out.println("Nethier Increasing nor Decreasing");
        }
        
    in.close();    
    }
    
}
