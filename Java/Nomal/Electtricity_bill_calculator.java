import java.util.*;

public class Electtricity_bill_calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your unit: ");
        
        int a = 2;   // cost per unit for 51–150
        int b = 3;   // cost per unit for 151–200
        int c = 4;   // cost per unit above 200
        int f = 100; // fixed cost
        
        int n = in.nextInt();
        int charge = 0;

        if (n <= 50) {
            charge = f;  // flat cost
        } 
        else if (n <= 150) {
            charge = f + (n - 50) * a;
        } 
        else if (n <= 200) {
            charge = f + (100 * a) + (n - 150) * b;
        } 
        else { // above 200
            charge = f + (100 * a) + (50 * b) + (n - 200) * c;
        }

        System.out.println("Total Charge: " + charge);

        in.close();
    }
}
