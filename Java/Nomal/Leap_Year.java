import java.util.*;

public class Leap_Year {
    public static void main(String[] args){
        try(Scanner in = new Scanner(System.in)){
            System.out.print("Enter your Year :");
            int Year = in.nextInt();
            if((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)){
                System.out.println(Year + " is a Leap Year");
            }
            else {
                System.out.println(Year + " is not a Leap Year");
            }
        }
    }
}


// import java.util.*;

// public class Leap_Year {
//     public static void main(String[] args) {
//         try (Scanner in = new Scanner(System.in)) {
//             System.out.print("Enter your Year: ");
//             int year = in.nextInt();

//             if (year % 400 == 0) {
//                 System.out.println("Your Entered Year is a Leap Year");
//             } else if (year % 100 == 0) {
//                 System.out.println("Your Entered Year is not a Leap Year");
//             } else if (year % 4 == 0) {
//                 System.out.println("Your Entered Year is a Leap Year");
//             } else {
//                 System.out.println("Your Entered Year is not a Leap Year");
//             }
//         }
//     }
// }
