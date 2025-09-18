import java.util.*;

public class sum_till_x {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int sum = 0;
            System.out.print("Enter the number :");
            while (true) {
                String number = in.next();
                if (number.equals("x")) {
                    break;
                } else {
                    int newnumber = Integer.parseInt(number);
                    sum += newnumber;

                }

            }
            System.out.println("Sum of the current Number are :" + sum);

        }
    }
}
