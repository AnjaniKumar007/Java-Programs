public class even_odd_Arrays {
    public static void main(String[] args) {
        int [] arr =  {3,4,6,8,5,7,9,3,4};
        Even_odd(arr);
        
    }
    static void Even_odd(int[] arr){
        int even = 0;
        int odd = 0 ;
        for (int i = 0 ; i < arr.length ; i++){
            
            
            if (arr[i] % 2 == 0){
                even ++;
            }
            else{
                odd ++;
            }
            
        }
        System.out.println(even);
        System.out.println(odd);

    }
}
