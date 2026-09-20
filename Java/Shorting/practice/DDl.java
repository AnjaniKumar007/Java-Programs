

class Node{
    int data;
    Node Next;
    Node Prev;
    Node(int data){
        this.data = data;
        this.Next = null;
        this.Prev = null;
    }
}
class DDl{
    public static Node Create(Node Start, Node end, int data){
        Node newNode = new Node(data);
        if(Start == null){
            Start = newNode;
            end = newNode;
        }
        else{
            end.Next = newNode;
            newNode.Prev = end;
            end = newNode;

        }
        return end;
    }
    public static Node Inbeg(Node Start, Node end , int data){
        Node newNode = new Node(data);
        if(Start == null){
            Start = newNode;
            end=newNode;
        }
        else{
            Start.Prev = newNode;
            newNode.Next = Start;
            Start  = newNode; 
        }
        return Start;
    }
    public static Node InEnd(Node Start , Node end, int data){
        Node newNode = new Node(data);
        if(Start==null){
            return Inbeg(Start, end, data);
        }
        else{
            end.Next = newNode;
            newNode.Prev = end;
            end = newNode;
        }
        return end;
    }
    public static Node inAny(Node Start, Node end , int data, int pos){
        Node newNode = new Node(data);
        if(pos==1) return Inbeg(Start, end, data);
        Node temp = Start;
        for(int i = 1; i<pos-1 && temp != null; i++){
            temp = temp.Next;
        }
        if(temp == null || temp.Next == null) return InEnd(Start, end, data);

        newNode.Next = temp.Next;
        newNode.Prev = temp;
        temp.Next = newNode;
        temp.Next.Prev = newNode;
        return Start;

    }
    public static Node delBeg(Node Start, Node end){
        if(Start == null){
            System.out.println("List is is empty");
        }
        if(Start.Next == null) return null;

        Start = Start.Next;
        Start.Prev = null;
        return Start;

    }
    public static Node delEnd(Node Start, Node end){
        if(end == null){
            System.out.println("List is empty");
            return null;
        }
        if(end.Prev == null) return null;

        end = end.Prev;
        end.Next = null;
        return null;

    }
    public static Node delAny(Node Start , Node end, int pos){
        if(pos == 1) return delBeg(Start, end);
        Node temp = Start;
        for(int i = 1; i<pos&& temp != null; i++){
            temp= temp.Next;
        }
        if(temp == null || temp.Prev == null|| temp.Next== null) return null;
        temp.Prev.Next= temp.Next;
        temp.Next.Prev = temp.Prev;
        return Start;

    }
    public static void Search(Node Start, Node end, int key){
        if(Start == null){
            System.out.println("List is empty");
        }
        Node temp = Start;
        while(temp != null){
            if(temp.data == key){
                System.out.println("Data Found");
                return;
            }
            temp = temp.Next;

        }
        System.out.println("Data NOt Found");
    }

}