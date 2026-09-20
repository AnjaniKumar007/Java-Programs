abstract class Shape {
}

class rectangle extends Shape{
    double Area(int a, int b){
        return a*b;
    }
}
class triangle extends Shape{
    double Area(int h, int base){
        return 0.5*h*base;
    }
}
class Circle extends Shape{
    double Area(int r){
        return Math.PI*r*r;
    }
}


public class Areaofshape {
    public static void main(String[] args) {
        rectangle ob1 = new rectangle();
        System.out.println(ob1.Area(2, 5));
        triangle ob2 = new triangle();
        System.out.println(ob2.Area(2, 4));
        Circle ob3 = new Circle();
        System.out.println(ob3.Area(6));
    }
}
