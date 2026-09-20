import java.util.Arrays;

public class cycle {
    public static void main(String[] args) {
        int[] arr = {5 ,3, 4, 1 ,2};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void Sort(int[] arr){
        for(int i = 0 ; i < arr.length-1 ;){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr , i , correct);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        
    }
}
