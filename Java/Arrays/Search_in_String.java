
import java.util.Arrays;



public class Search_in_String{
    public static void main(String[] args) {

        String name = "Anjani";
        char target = 'n';
        boolean ans = Search(name , target);
        System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray()));

    }
    static boolean Search(String str ,char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0 ; i< str.length() ; i++){
            if (str.charAt(i) == target){
            } else {
                return true;
            }


            }
            return false;

    }
}

