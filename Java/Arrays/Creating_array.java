import java.util.Arrays;
import java.util.Scanner;

public class Creating_array {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {

            // // this hole thing is aarray of premitive data type.

            // //this is maual method to store data in a array
            
            // int[] arry = new int[5];
            // arry[0] = 1;
            // arry[1] = 13;
            // arry[2] = 12;
            // arry[3] = 12;
            // arry[4] = 15;
            // System.out.println(arry[0]);

            // // this for loop method of storing data in array which more efficient


            // System.out.print("Enter the Values of the array :");

            // for (int i = 0 ; i< arry.length ; i++){
            //     arry[i] = in.nextInt();
            // }

            // // second way of printing of array data , this the best way
            // System.out.println(Arrays.toString(arry));

            // // this for loop to print the values of the array.
            // for (int i = 0 ; i< arry.length ; i++){
            //     System.out.print(arry[i] + " ");
            // }



            // // there is another way also
            // for (int num : arry){
            //     System.out.print(num);
            // }

        // here object arrays like string data type.
        String[] str = new String[4];
        str[0] = "Anjani";
        str[1] = "Anjani kumar";
        str[2] = "Anjani best";
        str[3] = "Anjani hello";
        System.out.println(str[0]);


        System.out.print("Enter  the vlaues of the arrays :");

        for(int i = 0 ; i < str.length ; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        str[0] = "anjani";
        System.out.println(Arrays.toString(str));





        }
        
    }
}
