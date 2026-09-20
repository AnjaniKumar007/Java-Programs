public class Overloading {
    public static void main(String[] args) {
        fun(67);                 // calls fun(int a)
        fun("Anjani");           // calls fun(String name)

        int ans2 = sum(3, 4); // calls sum(int, int)
        System.out.println(ans2);

        int ans = sum(3, 4, 78); // calls sum(int, int, int)
        System.out.println(ans);

        
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}
