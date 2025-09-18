import java.util.Scanner;
public class No_of_2_in_Given_number {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number you want to check");
        int n = in.nextInt();
        int count = 0;
        while (n>0){
            int rem = n % 10;
            if (rem == 2){
                
                count++;
                
            }
            
            n = n/10;
        } 
        System.out.println(count);
        
    }
}