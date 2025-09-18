import java.util.*;
public class armstrom {
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter the Number :");
            int num = in.nextInt();
            int original = num;
            int result = 0;
            int digits = String.valueOf(num).length();
            while (num!=0){
                int digit = num % 10;
                result += (int) Math.round(Math.pow(digit,digits));
                
                num = num/10;
        
            }
            if (result == original ){
                System.out.println("Armstrong");
            }
            else{
                System.out.println("Not Armstrong");
            }
            
            
        }
    }
}
    
    

