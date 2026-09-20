import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {5,2,4,3,1};
        SelectionSearch(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void SelectionSearch(int[] arr){
        for(int i = 0 ; i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = MaxIndex(arr , 0 , last);
            swap(arr,maxIndex , last);
        }
    }
    static int MaxIndex(int[] arr , int start , int last){
        int max = start;
        for(int i = 1 ; i<=last ;i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;

    }
    static void swap(int[] arr,int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        
    }
}
