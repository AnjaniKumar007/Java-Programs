import java.util.*;
public class Multiplication_table {
    public static void main(String [] args){
        try(Scanner in =  new Scanner(System.in)){
            System.out.print("Enter A Number Which You want A multiplication table :");
            int Num = in.nextInt();
            for (int i = 1 ; i<= 10 ; i++){
                System.out.println(Num + " X " + i + " = " + Num*i);
            }
        }
    }
}