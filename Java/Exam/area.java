public class area{
    public static void main(String[] args){
        int radius = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);
        double area = (Math.PI * radius * radius) + (2*Math.PI * radius * height);
        System.out.println(area);
    }
} 