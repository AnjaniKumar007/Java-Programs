public class recursionpower {
    static int product(int a, int b){
        if(b==0) return 0;
        return a+product(a, b-1);
    }
}
