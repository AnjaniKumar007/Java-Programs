
public class Typecasting {
    public static void main(String[] args){

        // Type Casting
        int num =  (int)(62.34f);
        System.out.println(num);

        // Automatic Type Promotion in Expressions
        int a = 257;
        byte b = (byte)(a);  // 257 % 256 = 1
        System.out.println(b);

        byte a1 = 40;
        byte b1 = 50 ;
        byte c1 = 100;
        int d1 = a1*b1 / c1; // 40*50 = 2000 / 100 = 20
        System.out.println(d1);

            // byte x = 50;
            // intz = x*4;
            // System.out.println(z);  // This will give error because x is promoted to int and the result will be int

        int number = 'A'; // ASCII value of A is 65
        System.out.println(number);

        int m = 223453;
        char c = 'a';
        short s = 45;
        long l = 3424l;
        float f = 23.53f;
        double d = 131.234;
        Double result = f*d + m/c - l*s;
        // double + int + long = double
        // Hence the result will be double
        System.out.println((f*d) +" "+ (m/c) +" " +(l*s));
        System.out.println(result);


    }
}
