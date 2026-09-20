import java.util.Scanner;

public class queue {
    public static final int Max = 10;
    public static int front = -1;
    public static int rear = -1;
    static Scanner in = new Scanner(System.in);

    public static void insert(int[] Q){
        if(rear == Max-1){
            System.out.println("Queue Overflow");
        }
        else{
            System.out.println("Enter the Element : ");
            int x = in.nextInt();
            if(front == -1 && rear ==-1){
                front =0;
                rear = 0;
            }
            else{
                rear = rear+1;
            }
            Q[rear] = x;
        }
    }
    public static void delete(int[] Q){
        if(front == -1){
            System.out.println("Queue Under Flow");
        }
        else if(front==rear){
            System.out.println("Deleted Element : " + Q[front]);
            front = -1;
            rear =-1;
        }
        else{
            System.out.println("Deleted elememnt : " + Q[front]);
            front = front+1;
        }
    }
    public static void Display(int[] Q){
        if(front == -1){
            System.out.println("Queue is empty");
        }
        else{
            for(int i = front; i<=rear ; i++){
                System.out.println(Q[front] + " <--");
            }
        }
    }
    public static boolean isFull(int rear){
        return (rear == Max-1);
    }
    public static boolean isEmpty(int front){
        return (front == -1);
    }


}
