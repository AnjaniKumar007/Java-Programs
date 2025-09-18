import java.util.*;

// public class Switch_case {
//     public static void main(String[] args){
//         try (Scanner in = new Scanner(System.in)) {
//             System.out.print("Enter a name of a Furit :");
//             String Furits = in.next();
//             Furits = Furits.toLowerCase();
            
//             switch (Furits) {
//                 case "mango" -> System.out.println("King of furits");
//                 case "apple" -> System.out.println("Good for health");
//                 case "oranges" -> System.out.println("The furit name which aslo use as colour ");
                    
//                 case "grapes" -> System.out.println("Small round furit");
//                 default -> System.out.println("Enter a valid furit name");
//             }
//         }
        
//     }
// }

public class Switch_case{
    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)){
            System.out.print("Enter a number between 1 to 7 :");
            int num = input.nextInt();
            switch (num) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Invalid Number");
            }   
        }
    }
}