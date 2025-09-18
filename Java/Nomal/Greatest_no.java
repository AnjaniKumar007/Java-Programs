import java.util.*;
public class Greatest_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the value of A :");
        int a = in.nextInt();
        System.out.print("Enter the value of B:");
        int b = in.nextInt();
        System.out.print("Enter the value of C :");
        int c = in.nextInt();
        
        // if (a>b && a>c){
        //     System.out.println("A is the greatest");
        // }
        // else if (b>a && b>c){
        //     System.out.println("B is greatest");
        // }
        // else{
        //     System.out.println("c is Greatest");
        // }

        int max = Math.max(c,Math.max(a,b));
        System.out.println("The greatest number is :"+max);
    }
}