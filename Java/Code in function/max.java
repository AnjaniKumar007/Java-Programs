
import java.util.Scanner;

public class max{
    public static void main(String[] args){
    try(Scanner in = new Scanner(System.in)){
        int a = in.nextInt();
        int b  = in.nextInt();
        int c = in.nextInt();
        max(a, b, c);

    }

    }
    static void max(int a , int b , int c){
        if ((a>b) && (a>c)){
            System.out.println("A is bigger");
        }
        else if ((b>a) && (b>c)){
            System.out.println("B is biiger");

        }
        else{
            System.out.println("C is bigger");
        }
    }
}