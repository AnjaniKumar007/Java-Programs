import java.util.Scanner;
public class even_odd{
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int a = in.nextInt();
            evenOdd(a);

        }
    }
    static void evenOdd(int a){
        if (a % 2 == 0){
            System.out.println("Given number is even");
        }
        else{
            System.out.println("Given Number is odd");
        }

    }

}

