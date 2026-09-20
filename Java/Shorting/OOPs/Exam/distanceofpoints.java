class Point{
    double x, y;
    void setdata(int x , int y){
        this.x = x;
        this.y = y;
    }
    void dispaly(){
        System.out.println("The points are : "+ x + " " + y);
    }
    double distance(Point p){
        double dx  = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    
}



public class distanceofpoints {
    public static void main(String[] args){
        Point p1 = new Point();
        Point p2 = new Point();
        p1.setdata(2, 3);
        p2.setdata(6, 7);
        p1.dispaly();
        p2.dispaly();
        System.out.println("The distance between the point is : " + p1.distance(p2));
    }
 
}
