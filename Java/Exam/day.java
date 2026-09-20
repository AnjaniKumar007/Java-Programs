public class day{
    public static void main(String[] args){
        int days = 40;
        int year = days / 365;
        int rem = days % 365;
        int month  = rem / 30;
        int day = days % 30;
        System.out.printf("%d days = %d years, %d months, %d days%n", days, year, month, day);
    }
}