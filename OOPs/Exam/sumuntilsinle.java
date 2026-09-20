public class sumuntilsinle {
    static int Sum(int n){
        
        while(n>10){
            int sum = 0 ;
            while(n>0){
                int digit = n % 10;
                sum += digit;
                n /= 10;
            }
            n = sum;


        }
        
        return n;
    }
    public static void main(String[] args) {
        System.out.println(Sum(9294));
    }
}
