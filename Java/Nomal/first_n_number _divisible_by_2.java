import java.util.Scanner;

class first_n_number_divisible_by_21{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you last number by which you need know that the no is divisible by 2 :");
        int n = input.nextInt();
        for(int i = 1 ; i<=n ; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}