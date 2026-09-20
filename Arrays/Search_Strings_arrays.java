import java.util.Scanner;

public class Search_Strings_arrays {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)){
            String check = in.next();
            String[] arr = {"Anjani", "in","Heloow","bol"};
            boolean ans = Search(arr, check);
            System.out.println(ans);
        }
    }
    static boolean Search(String[] arr,String check){
        for (String arr1 : arr) {
            if (arr1.equalsIgnoreCase(check)){
                return true;
            }
        }
        return false;

    }
}
