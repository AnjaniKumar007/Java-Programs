// import java.util.Scanner;


// Even number using while loop


// public class Even_no{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter a numbber By which you need even number: ");
//         int num = input.nextInt();
//         int i = 1;
//         while(i<num){
//             if(i%2==0){
//                 System.out.println(i);
//             }
//             i = i+1;
//         }

//     }



// }

// Even number using for loop

import java.util.Scanner;

public class Even_no{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a numbber By which you need even number: ");
        int num = input.nextInt();
        for (int i=1 ; i<num; i=i+1){
            if (i%2==0){
                System.out.println(i);
                
            }
            
        }


    }



}




