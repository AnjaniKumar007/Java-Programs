
import java.util.Arrays;

public class changing_values_of_arrays_using_functions{
    public static void main(String[] args) {
        int[] nums = {1 , 2, 3 , 5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

        
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}