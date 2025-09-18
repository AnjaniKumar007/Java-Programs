
import java.util.Scanner;

public class Temprature {
public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Temperature in Celsius: ");
    float Celsius = input.nextFloat();
    Float Fharanhite = Celsius * 9/5 + 32;
    System.out.println("Temperature in Fharanhite is: "+ Fharanhite);

}
}
