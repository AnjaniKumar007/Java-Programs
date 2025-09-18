import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the Marks :");
            int marks = in.nextInt();
            System.out.println(Grade(marks));
        }
    }

    static String Grade(int mark) {
        if (mark > 100 || mark < 0) {
            return "Enter Correct Marks Between 0-100";
        } else if (mark >= 91) {
            return "A Grade";
        } else if (mark >= 81) {
            return "B Grade";
        } else if (mark >= 71) {
            return "C Grade";
        } else if (mark >= 61) {
            return "D Grade";
        } else if (mark >= 51) {
            return "E Grade";
        } else if (mark >= 41) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}
