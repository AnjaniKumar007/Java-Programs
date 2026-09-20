public class sum_arrays {
    public static void main(String[] args) {
        int[] arr = {23,434,23,34,426,5};
        System.out.println(Sum(arr));
    }
    static int Sum(int[] arr){
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++){
            int result = arr[i] + sum;
            sum = result;
        }
        return sum;
    }
    
}
