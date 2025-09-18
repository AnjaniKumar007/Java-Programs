public class shadowing {
    static int x = 69; // class variable (global)

    public static void main(String[] args) {
        System.out.println(x); // prints 69 (class variable)

        int x = 420;           // local variable shadows class variable
        System.out.println(x); // prints 420 (local variable)

        fun();                 // calls fun() which prints class variable
    }

    static void fun() {
        System.out.println(x); // prints 69 (class variable, since no local x here)
    }
}

