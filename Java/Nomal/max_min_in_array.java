
import java.util.Scanner;

public class max_min_in_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no of element in array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array : ");
        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = in.nextInt();
        }
        MaxMin(arr);

        
    }
    static void MaxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] > max){
                max =  arr[i];
            }
            if(arr[i] < min ){
                min = arr[i];
            }
        }
        int maxcount = 0;
        int mincount = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(max == arr[i]){
                maxcount++;
            }
            if(min == arr[i]){
                mincount++;
            }
        }
        int maxpos = 0;
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] == max){
                maxpos = i;
                break;
            }
        }
        int minpos = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == min){
                minpos = i;
            }
        }
        System.out.println("The max element : " + max);
        System.out.println("The min element : " + min);
        System.out.println("The max element occrence : " + maxcount);
        System.out.println("The min element occrence : " + mincount);
        System.out.println("The max element position : " + maxpos);
        System.out.println("The min element position : " + minpos);
        
    }

}
