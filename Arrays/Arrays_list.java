import java.util.ArrayList;
import java.util.Scanner;
public class Arrays_list {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){

            //syntax
            ArrayList<Integer> list = new ArrayList<>(6);
            
            // list.add(12);
            // list.add(120);
            // list.add(125);
            // list.add(122);
            // list.add(1245);
            // list.add(125);
            // list.add(123);

            // list.set(0, 69);
            // list.remove(3);
            // System.out.println(list);

            System.out.print("Enter the values :");
            // getting the input for lsit
            for(int i = 0 ; i < 6 ; i++){
                list.add(in.nextInt());
                

            }
            // get item at any index
            for (int i = 0 ; i<6 ; i++){
                list.get(i);
            }

            System.out.println(list);


        }
        
    }
    
}
