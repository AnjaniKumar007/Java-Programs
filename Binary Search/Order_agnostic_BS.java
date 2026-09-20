public class Order_agnostic_BS{
    public static void main(String[] args) {
        int[] arr = {19 ,15 , 14 ,2 , 1, 0, -1, -5, -6, -7, -8,-24 , -32, -45, -67};
        int target = 14;
        int ans = Binary_Search(arr, target);
        System.out.println(ans);
        
    }
    static int Binary_Search(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAGS = arr[start] < arr[end];

        
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAGS){

                if (target < arr[mid]){
                 end  = mid -1;
                }
                else if (target > arr[mid]){
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]){
                end  = mid -1;
                }
                else if (target < arr[mid]){
                    start = mid + 1;
                }
            }
            
            
        }
    return -1;
    }
}