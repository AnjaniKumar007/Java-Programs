import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter the Number :");
            int num = in.nextInt();
            System.out.println(Factorial(num));
        }
    }
    static int Factorial(int a){
        int f = 1;
        for (int i = 1 ; i<=a ; i++){
            f = f*i;
        }
        return f;
    }
}
