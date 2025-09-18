import java.util.Scanner;
public class Pythagorean_triplet{
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter the Numbers :");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            int num3 = in.nextInt();
        Boolean reuslt = Pytho(num1,num2,num3);
        System.out.println(reuslt);

        }
    }
    static boolean Pytho(int a , int b, int c){
        if (a*a + b*b == c*c){
            return true;
        }
        else if (b*b + c*c == a*a){
            return true;
        }
        else if (c*c + a*a == b*b){
            return true;
        }
        return false;
    }
}