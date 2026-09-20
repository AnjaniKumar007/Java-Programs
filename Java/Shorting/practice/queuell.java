import java.util.Scanner;

class QueueEnds {
    Node front;
    Node rear;
    QueueEnds(Node front, Node rear) {
        this.front = front;
        this.rear = rear;
    }
}

public class queuell {
    static Scanner in = new Scanner(System.in);
    
    public static QueueEnds insert(Node front, Node rear) {
        Node newNode = new Node();
        System.out.println("Enter the data");
        newNode.data = in.nextInt();
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.Next = newNode;
            rear = newNode;
        }
        return new QueueEnds(front, rear);
    }
    
    public static QueueEnds delNode(Node front, Node rear) {
        if (front == null) {
            System.out.println("Queue UnderFlow");
        } else if (front == rear) {
            System.out.println("Deleted Element : " + front.data);
            front = rear = null;
        } else {
            System.out.println("Deleted Element : " + front.data);
            front = front.Next;
        }
        return new QueueEnds(front, rear);
    }
    
    public static void Display(Node front, Node rear) {
        if (front == null) {
            System.out.println("Queue Underflow");
        } else {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.Next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    Node front = null, rear = null;
    
    QueueEnds q = queuell.insert(front, rear);
    front = q.front; rear = q.rear;
    
    q = queuell.delNode(front, rear);
    front = q.front; rear = q.rear;
    
    queuell.Display(front, rear);
}
}