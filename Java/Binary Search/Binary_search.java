public class Binary_search{
    public static void main(String[] args) {
        int[] arr = {-19 , -12 ,-14 ,-2 , -1, 0, 1, 5, 6, 7, 8,24 , 32, 45, 67};
        int target = 5;
        int ans = Binary_Search(arr, target);
        System.out.println(ans);
    }
    static int Binary_Search(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = start + (end-start)/2;
            if (target < arr[mid]){
                end  = mid -1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
    return -1;
    }
    
}