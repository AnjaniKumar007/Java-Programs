public class genricmethod {
    public static void main(String[] args) {
        
    }

    public static <T> int Count(T[] arr, T key){
        int count = 0 ;
        for(int i  = 0; i<arr.length; i++){
            if(arr[i].equals(key)){
                count++;
            }
        }
        return count;

    }
    
}
