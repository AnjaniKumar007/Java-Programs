public class axis{
    public static void main(String[] args){
        int x = 1;
        int y = 0;
        if (x>0 && y>0){
            System.out.println("Point lies in 1st quadrant");
        }
        else if (x<0 && y>0){
            System.out.println("Point in 2nd quad");
        }
        else if (x<0 && y<0){
            System.out.println("point in 3rd quad");
        }
        else if (x>0 && y<0){
            System.out.println("point in 4th quad");
        }
        else if (x==0){
            System.out.println("point lies on y-axis");
        }
        else{
            System.out.println("point lies on x-axis");
        }
    }
}