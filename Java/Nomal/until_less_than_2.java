import java.util.Scanner;
public class until_less_than_2{
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the number greater than 2 : ");
        int n =  in.nextInt();
        int count = 0;
        while (n>2) {
            n /= 2;
            count++;
        }
        System.out.println("The number of times one must repeatedly divide this number by 2 before getting a value less than 2 is "+ count + ".");
    }
}