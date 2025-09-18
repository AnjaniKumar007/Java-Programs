import java.util.Scanner;

public class circumference{
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)){
            System.out.println("Enter the Radius of the Circle :");
            Float cir = in.nextFloat();
            System.out.println(circum(cir));
        }
    }
    static Float circum(Float a){
        Float reslut = 2*22/7*a;
        return reslut;
    }

}