public class leap{
    public static void main(String[] args){
        int Year  = Integer.parseInt(args[0]);
        if(Year % 4 == 0){
            if(Year % 100 != 0){
                System.out.println("true");
            }
            else if (Year % 400 == 0){
                System.out.println("ture");
            }
        }
        else{
            System.out.println("false");
        }
    }
}