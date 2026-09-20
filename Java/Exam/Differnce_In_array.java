public class Differnce_In_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Differnce_In_array(arr));

    }
    public  static int Differnce_In_array(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            else if(arr[i] < min){
                min = arr[i];
            }
        }
        return max-min;
    }
}
