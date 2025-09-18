import java.util.*;
public class Simple_intrest {
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter the The principal Amount :");
            int Principal = in.nextInt();
            System.out.print("Enter the The Rate of intrest :");
            int Rate = in.nextInt();
            System.out.print("Enter the The Time in year :");
            int Time = in.nextInt();
            int Simple_Intrest = (Principal * Rate * Time)/100;
            System.out.println("Simple Intrest :" + Simple_Intrest);
            int Total_Amount = Principal + Simple_Intrest ;  
            System.out.println("Total Amount :" + Total_Amount);
                
        }
    }
}
    
    