import java.util.Scanner;

public class vote_limit{
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter your age :");
            int age = in.nextInt();
            VoteLimit(age);
        }

    }
    static void VoteLimit(int age){
        if (age >= 18 ){
            System.out.println("You Are Eligible for giving the voting.");
        }
        else{
            System.out.println("You are not Eligible to give the vote.");
        }

    }
}