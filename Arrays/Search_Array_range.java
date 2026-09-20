public class Search_Array_range {
    public static void main(String[] args) {
        int[] arr = {1,4,6,3,7,9,8,2,3,12};
        int start = 3;
        int end = 7;
        int target = 9;
        boolean ans = Search(arr, start, end, target);
        System.out.println(ans);
    }
    static boolean Search(int[] arr1 ,int start , int end,int t){
        for (int i = start ; i <= end ; i++){
            if (arr1[i]==t){
                return true;
            }

        }
        return false;
    }
}
