import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter The word :");
            String word = in.next();
            String Reverse_String = new StringBuilder(word).reverse().toString();
            if (word.equals(Reverse_String)) {
                System.out.println("The word given is Palindrome");

            } else {
                System.out.println("The given word id not palindrome");
            }
        }
    }
}
