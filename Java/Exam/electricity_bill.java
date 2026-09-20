
import java.util.Scanner;

public class electricity_bill {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter the Unit Consume :");
        int unit = in.nextInt();
        double bill;
        if(unit <= 50){
            bill = 3.0*unit;
        }
        else if(unit <= 200){
            bill = (50*3.0) + (unit-50) * 4.80;
        }
        else if(unit <= 400){
            bill = (50*3.0) + (150 * 4.80) + (unit-200) * 5.80;
        }
        else{
            bill = (50*3.0) + (150 * 4.80) + (200 * 5.80) + (unit - 400) * 6.20;
        }
        System.out.println("The Electicity Bill = " + bill);
    }
}
