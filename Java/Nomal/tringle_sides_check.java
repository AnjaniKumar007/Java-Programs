
import java.util.Scanner;

public class tringle_sides_check {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sides of the tringle");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if ((a+b>c) || (a+c>b) || (c+b>a)){
            if (a==b && b==c && c==a){
                System.out.println("Eqilateral");
            }
            else if (a==b || a==c || b==c){
                System.out.println("isosceles");
            }
            else{
                System.out.println("Scalen");
            }
        }
        else{
            System.out.println("Invalid side");
        }

    in.close();    
    }
}
