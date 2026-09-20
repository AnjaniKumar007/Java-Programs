public class max_min {
    public static void main(String[] args) {
        int[] arr = {1,232,34,54,65,34};
        System.out.println(Max(arr));
        System.out.println(min(arr));
        
    }
    static int Max(int[] arr){
        int maxvalue = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if (arr[i]>maxvalue){
                maxvalue = arr[i];
                
                
            }
            
        }
        return maxvalue;
    }
    static int  min(int[] arr){
        int minvalue = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if (arr[i]<minvalue){
                minvalue = arr[i];
            }
        }
        return minvalue;
    }
    
}
