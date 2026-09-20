class Node {
    int data;
    Node Next;
    Node(int data){
        this.data = data;
        this.Next = null;
    }
}


public class stackll {
    public static Node push(Node top, int data){
        Node newNode = new Node(data);
        newNode.Next = top;
        top = newNode;
        return top;
    }
    public static Node pop(Node top){
        if(top == null){
            System.out.println("Stack Underflow");
        }
        else{
            top = top.Next;
            
        }
        return top;
    }
    public static void Display(Node top){
        if(top==null){
            System.out.println("Stack is Empty");
        }
        else{
            Node temp = top;
            while(temp != null){
                System.out.println(temp.data + " --> ");
                temp = temp.Next;
            }
            System.out.println();

        }
    }
}
