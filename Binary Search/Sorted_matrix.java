import java.util.Arrays;

public class Sorted_matrix {
    public static void main(String[] args) {
        int[][] arr = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
        };
        System.out.println(Arrays.toString(Search(arr,14 )));
    }
    static int[] BinarySearch(int[][] arr ,int row,int cstart , int cEnd,int target){
        while(cstart <= cEnd){
            int mid = cstart + (cEnd-cstart)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }
            if(arr[row][mid] > target){
                cEnd = mid - 1;
            }
            else{
                cstart = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] Search(int[][] arr , int target){
        int row = arr.length;
        int cols  = arr[0].length;
        if(row == 1){
            return BinarySearch(arr, 0, 0, cols-1, target);
        }
        int rstart = 0;
        int rend = row-1;
        int cmid  = cols/2;
        while(rstart < (rend-1)){
            int mid = rstart + (rend - rstart)/2;
            if(arr[mid][cmid]==target){
                return new int[] {mid , cmid};
            }
            if(arr[mid][cmid]>target){
                rend = mid;
            }
            else{
                rstart = mid;
            }
        }
        if (arr[rstart][cmid] == target) {
            return new int[]{rstart, cmid};
        }
        if (arr[rstart + 1][cmid] == target) {
            return new int[]{rstart + 1, cmid};
        }

        // 1st quadrant: top-left
        if (target <= arr[rstart][cmid - 1]) {
            return BinarySearch(arr, rstart, 0, cmid - 1, target);
        }

        // 2nd quadrant: top-right
        if (target >= arr[rstart][cmid + 1] && target <= arr[rstart][cols - 1]) {
            return BinarySearch(arr, rstart, cmid + 1, cols - 1, target);
        }

        // 3rd quadrant: bottom-left
        if (target <= arr[rstart + 1][cmid - 1]) {
            return BinarySearch(arr, rstart + 1, 0, cmid - 1, target);
        }

        // 4th quadrant: bottom-right
        return BinarySearch(arr, rstart + 1, cmid + 1, cols - 1, target);
    
    }
}
