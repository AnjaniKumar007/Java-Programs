import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter the Numbers :");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.println(Sum(num1 , num2));
        }
    }
    public static int Sum(int a , int b){
        int sum = a + b;
        return sum;
    }
}