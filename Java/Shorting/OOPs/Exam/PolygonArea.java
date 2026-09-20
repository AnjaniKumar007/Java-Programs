interface Polygon {
    double Area();

    
}
class Rectangle implements Polygon{
    int length;
    int width;
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public double Area(){
        return length*width;
    }
    
}
class Square implements Polygon{
    int side;
    Square(int side){
        this.side = side;
    }
    public double Area(){
        return side* side;
    }
}



public class PolygonArea {
    public static void main(String[] args){
        Rectangle ob1 = new Rectangle(3,4);
        Square ob2 = new Square(4);
        System.out.println("The Area of the rectangle : " + ob1.Area());
        System.out.println("The Area of the Square : " + ob2.Area());
    }
    
}
