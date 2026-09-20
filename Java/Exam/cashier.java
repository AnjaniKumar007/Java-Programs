import java.util.*;

public class cashier {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Bill :");
        int Bill = in.nextInt();
        if(Bill >= 1000){
            System.out.println("No need to return money");
        }
        if((1000-Bill) % 20 == 0){
            System.out.println("Cashier Need to Return :" + (1000-Bill));
        }
        else{
            int Newbill = 1000-Bill;
            int mod = Newbill % 20;
            Newbill -= mod;
            System.out.println("Cashier Need to Return :" + Newbill);
        }
    }
}
