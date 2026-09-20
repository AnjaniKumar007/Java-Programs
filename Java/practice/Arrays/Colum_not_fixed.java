
public class Colum_not_fixed {
    public static void main(String[] args) {
        int[][] arr = {
            {1 , 2 ,3},
            {1,3,2,3},
            {2 , 4 ,4}
        };

        for (int[] arr1 : arr) {
            for (int col = 0; col < arr1.length; col++) {
                System.out.print(arr1[col] + " ");
            }
            System.out.println();
        }
    
    }
    
}