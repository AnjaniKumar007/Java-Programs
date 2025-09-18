
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        try{Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter Your Second Number : ");
        int num2 =  input.nextInt();
        int Sum = num1 +num2;
        System.out.println("The Sum of Your number is : "  + Sum);}
        catch(Exception e){
            System.out.println("Please Enter Valid Temperatures");
        }
    }
}
