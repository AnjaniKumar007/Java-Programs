import java.util.Scanner;
public class Do{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num;
        do{
            System.out.print("Enter the number(0 to Stop) : ");
            num = in.nextInt();
            if(num % 2 == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        
        }
        while(num!=0);
        System.out.println("Program end");
    }
}