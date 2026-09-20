

public class Armstrom_no_upto_1000 {
    public static void main(String[] args){

            // System.out.print("Ennter you number :");
            // int n = in.nextInt();
        for (int i = 100 ; i < 1000 ; i++){
            if (isArmstrom(i)){
                System.out.print(i + " ");
            }
        }

    }
    static boolean isArmstrom(int n){
        int orignal = n;
        int sum = 0;
        while (n>0){
            int rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n / 10;
            
        }
        return sum == orignal;
    }
}