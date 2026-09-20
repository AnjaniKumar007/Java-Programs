
import java.util.Scanner;

public class guess_game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int comp = (int)(Math.random()*9 + 1);
        System.out.println("Computer Guess : " + comp);
        if (input == comp){
            System.out.println("You got it");
        }
        else if ((input - comp) == -1){
            System.out.println("You almost Got it");
        }
        else if ((input - comp) == 1){
            System.out.println("You almost Got it");
        }
        else{
            System.out.println("Sorry you got it wrong");
        }

            
    in.close();    
    }
}
