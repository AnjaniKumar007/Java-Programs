public class max_value_arr {
    public static void main(String[] args) {
        int[] arr = {1,4,4,6,89,54,342,345,564,};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 1, 4));
    }
    static int max(int[] arr){
        int maxVlaue = arr[0];
        for(int i= 1 ; i < arr.length ; i++){
            if (arr[i]> maxVlaue){
                maxVlaue = arr[i];
            }


        }
        return maxVlaue;

    }
    static int maxRange(int[] arr , int start , int end){
        int maxVlaue = arr[0];
        for(int i= start ; i <= end ; i++){
            if (arr[i]> maxVlaue){
                maxVlaue = arr[i];
            }


        }
        return maxVlaue;

    }
}
