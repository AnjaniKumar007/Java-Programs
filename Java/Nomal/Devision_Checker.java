import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your marks :");
        int Marks = input.nextInt();
        if (Marks >= 60) {
            System.out.println("You Score 1st Devision");
        } else if (Marks >= 45) {
            System.out.println("You Score 2nd Devision");
        } else if (Marks >= 33) {
            System.out.println("You Score 3rd Devision");
        } else if (Marks < 33) {
            System.out.println("You Fail in your Exam");
        }
    }
}