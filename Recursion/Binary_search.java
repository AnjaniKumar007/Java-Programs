public class Binary_search{
    public static void main(String[] args){
        int[] arr = {1,43,54,67,98};
        int target = 98;
        System.out.println(Search(arr, 0, arr.length-1, target));
    }
    static int Search(int[] arr, int s, int e, int target){
        if(s>e){
            return -1;
        }
        int m = s + (e-s) /2;
        if(arr[m]== target){
            return m;
        }
        if(arr[m] > target){
            return Search(arr,s,m-1,target);
        }
        return Search(arr,m+1,e,target);

    }
}
