import java.util.Scanner;

public class Stackarr {
    public static final int Max = 10;
    static Scanner in = new Scanner(System.in);
    public static int push(int s[], int top){
        if(top == Max-1){
            System.out.println("Stack overflow");
        }
        else{
            System.out.println("Enter the element");
            int x = in.nextInt();
            top = top+1;
            s[top] = x;
        }
        return top;
    }
    public static int pop(int[] s ,  int top){
        if(top == -1) System.out.println("Stack underflow");
        else{
            System.out.println("Deleted Element : " + s[top]);
            top = top-1;
        }
        return top;
    }
    public static void Display(int s[], int top){
        if(top == -1) System.out.println("Stack is Empty");
        else{
            for(int i = top; i>= 0; i--){
                System.out.println(s[i] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isFull(int top){
        return (top == Max-1);
    }
    public static boolean isEmpty(int top){
        return (top == -1);
    }
    // public static void main(String[] arg){
    //     int[] s = new int[Max];
    //     int top = -1;
    // }
}
