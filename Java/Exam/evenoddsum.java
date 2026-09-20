public class evenoddsum{
    public static void main(String[] args){
        int range = 10;
        int sum = 0;
        int product = 1;
        for (int i = 1 ; i<= range ;i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
            else{
                product = product * i;
            }
        }
        System.out.println("sum :" + sum + "  product :" + product);
    }
}