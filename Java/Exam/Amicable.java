
import java.util.Scanner;

public class Amicable{
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the pair of number you want to check : ");
        int a = in.nextInt(), b = in.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= a / 2 ; i++){
            if(a % i == 0){
                sum += i;
            }
        }
        if(sum == b){
            System.out.println("The given pair is Amicable");
        }
        else{
            System.out.println("The given pair is not Amicable");
        }
    }
}