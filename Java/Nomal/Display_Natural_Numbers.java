import java.util.Scanner;

// Display Natural Numbers in for loop

public class Display_Natural_Numbers{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number By which you need to display numbers: ");
        int n = input.nextInt();
        for(int i = 1; i<=n ; i++){
            System.out.println(i);
        }


    }



}

// Display Natural Numbers in while loop

// import java.util.Scanner;

// public class Even_no{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter a number By which you need to display numbers: ");
//         int n = input.nextInt();
//         int i = 0;
//         while (i<=n){
//             System.out.println(i);
//         i = i+1;
//         }
        

//     }



// }

