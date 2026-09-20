
import java.util.Arrays;


public class Search_in_2D {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 45, 36, 13},
            {2, 7, 3, 54},
            {23, 65, 2, 4}
        };
        int target = 65;
        int ans[] = Search(arr , target);
        System.out.println(Arrays.toString(ans));
        System.out.println(Max(arr));
        System.out.println(Min(arr));

    }
    static int[] Search(int[][] arr1 , int t){
        for (int row = 0 ; row < arr1.length ; row++){
            for (int col = 0 ; col < arr1[row].length ; col++){
                if (arr1[row][col] == t){
                    return new int[]{row,col};
                }

            }
        }
        return new int[] {-1,-1};
    }
    static int Max(int[][] arr2){
        int maxvalue = Integer.MIN_VALUE;
        for (int[] arr21 : arr2) {
            for (int col = 0; col < arr21.length; col++) {
                if (maxvalue < arr21[col]) {
                    maxvalue = arr21[col];
                }
            }
        }
        return maxvalue;

    }
    static int Min(int[][] arr2){
        int minvalue = Integer.MAX_VALUE;
        for (int[] arr21 : arr2) {
            for (int col = 0; col < arr21.length; col++) {
                if (minvalue > arr21[col]) {
                    minvalue = arr21[col];
                }
            }
        }
        return minvalue;
    }
}
