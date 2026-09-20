import java.util.Arrays;

public class merging_arryas {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,0,0,0};
        int m = lengthWithoutZero(arr1);
        int[] arr2 = {5,6,7};
        int n = lengthWithoutZero(arr2);
        Merge(arr1, m, arr2, n);
        System.out.println(Arrays.toString(arr1));
    }
    static void Merge(int[] arr1, int m , int[] arr2, int n){
        int[] mergedArray = new int[m+n];
        int k = 0;
        for(int i = 0 ; i<m ; i++){
            mergedArray[k++] = arr1[i];
        }
        for(int i = 0 ; i<n ; i++){
            mergedArray[k++] = arr2[i];
        }
        System.arraycopy(mergedArray, 0, arr1, 0, k);
    }
    static int lengthWithoutZero(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num != 0) count++;
        }
        return count;
    }
}
