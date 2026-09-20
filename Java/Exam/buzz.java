public class buzz{
    public static void main(String[] args){
        int n = 1247;
        boolean isbuzz = (n % 10 == 7) || (n % 7 == 0);
        System.out.println(isbuzz);
    }
}