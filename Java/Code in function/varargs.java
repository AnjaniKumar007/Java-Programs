import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
       fun(23,234,4324,2345,4,343,43,432);
       multiplefun(2, 3, "Anjani", "Rahul", "dvytsbhusc");
       demo(455);
       demo("anjani");
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ... v){
        System.out.println(Arrays.toString(v));

    }



    static void multiplefun(int a, int b, String ...v) {

    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}