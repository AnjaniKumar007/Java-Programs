public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        
        System.out.println(duplicate(arr));
    }
    static boolean duplicate(int[] arr){
        boolean res = false;
        for(int i = 0; i < arr.length ; i++){
            for(int j = i+1 ; j<arr.length ; j++){
                boolean ans = arr[i]==arr[j];
                if(ans){
                    return true;
                }
            }
            
        }
        return res;
        
    }
}
