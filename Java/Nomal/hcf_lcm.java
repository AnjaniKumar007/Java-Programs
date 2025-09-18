import java.util.*;
public class hcf_lcm {
    
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter the numbers :");
            int a = in.nextInt();
            int b = in.nextInt();
            int hcf = findHCF(a,b);
            int lcm = findLCM(a,b,hcf);
            System.out.println("HCF " + hcf);
            System.out.println("LCM " + lcm);
            
        }
    }
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int findLCM(int a , int b , int hcf){
        return (a*b)/hcf;
    }
    
        
}
// HCF and LCM of two numbers