import java.util.Arrays;
import java.util.Scanner;

public class multi_dimensinol {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            int[][] arr = new int[3][2];
            for (int[] arr1 : arr) {
                for (int col = 0; col < arr1.length; col++) {
                    arr1[col] = in.nextInt();
                }
            }
            for (int[] arr1 : arr) {
                System.out.println(Arrays.toString(arr1));
            }


            
        }
    }
}
