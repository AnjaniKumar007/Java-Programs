import java.util.Arrays;

public class Binary_search_in_2D_array{
    public static void main(String[] args) {
        int[][] arr = {
                      {22 , 35 , 45 , 53},
                      {16 , 24 , 39 , 59},
                      {19 , 21 , 59, 65},
                      {9 , 11 , 15 , 99}
        };
        System.out.println(Arrays.toString(Search(arr,15)));
    }
    static int[] Search(int[][] arr , int target){
        int r  = 0;
        int c = arr.length-1;
        while (r < arr.length && c >=0 ) {
            if(arr[r][c] == target){
                return new int[] {r , c};
            }
            if(arr[r][c] < target){
                r++;
            }
            else{
                c--;
            }
            
        }
        return new int[]{-1,-1};
    }
}