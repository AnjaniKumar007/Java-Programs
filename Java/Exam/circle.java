public class circle{
    public static void main(String[] args){
        int x = 4;
        int y = 4;
        int radius = 5;
        int x1 = 7;
        int y1 = 9;
        double dis = Math.pow(Math.pow((x1-x) , 2)+Math.pow((y1-y), 2) , 0.5);
        System.out.println(dis);
        if (dis < radius){
            System.out.println("Point is under the radius");
        }
        else if (dis == radius){
            System.out.println("Point is on the circle");
        }
        else{
            System.out.println("Point is outside of the circle");
        }
    }
}