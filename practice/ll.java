class Node {
    int data;
    Node Next;
    Node(int data){
        this.data = data;
        this.Next = null;
    }
}
class ll{
    public static Node Create(Node Start , int data){
        Node newNode =  new Node(data);
        if(Start == null){
            Start =  newNode;
        }
        else{
            Node temp = Start;
            while(temp.Next != null){
                temp = temp.Next;
            }
            temp.Next = newNode;
            
        }
        return Start;
    }
    public static Node Inbeg(Node Start, int data){
        Node newNode = new Node(data);
        if(Start == null) return newNode;
        else{
            newNode.Next = Start;
            Start = newNode;
            
        }
        return Start;                                                       
    }
    public static Node InEnd(Node Start, int data){
        Node newNode = new Node(data);
        if(Start == null){
            return Inbeg(Start, data);
        }
        else{
            Node temp = Start;
            while(temp.Next != null){
                temp = temp.Next;
            }
            temp.Next = newNode;
        }
        return Start;
    }
    public static Node inAny(Node Start , int data, int pos){
        Node newNode = new Node(data);
        if(pos == 1) return Inbeg(Start, data);
        else{
            Node temp = Start;
            for(int i = 1 ; i< pos-1 && temp.Next != null; i++){
                temp = temp.Next;
            }
            if(temp == null) System.out.println("Invalid postion");
            else{
                newNode.Next = temp.Next;
                temp.Next = newNode;
            }
        }
        return Start;
    }
    public static Node Delbeg(Node Start){
        if(Start == null) return Start;
        else{
            Start = Start.Next;
        }
        return Start;
    }
    public static Node DelEnd(Node Start){
        if(Start == null) System.out.print("Linked list Is empty");
        else if(Start.Next == null) Start=null;
        else{
            Node temp = Start;
            while (temp.Next.Next != null) {
                temp = temp.Next;
            }
            temp.Next = null;
        }
        return Start;
        

    }
    public static Node DelAny(Node Start, int pos){
        if(Start == null || pos <= 0){
            return Start;
        }
        if(pos == 1) return Delbeg(Start);
        Node temp =  Start;
        for(int i = 1 ; i< pos-1&& temp.Next != null ; i++){
            temp = temp.Next;
        }
        if (temp == null || temp.Next == null) {
        System.out.println("Invalid Position");
        return Start;
    }

        else{
            temp.Next = temp.Next.Next;
        }
        return Start;
    }
    public static Node Search(Node Start, int key){
        if(Start == null){
            return Start;
        }
        Node temp = Start;
        while (temp != null) {
            if(temp.data == key){
                System.out.println("Data Found");
            }
            temp = temp.Next;
        }
        return Start;

    }
    public static Node Sort(Node Start){
       if(Start == null) return Start;
        Node i , j;
        for(i=Start ; i.Next != null ; i=i.Next){
            for(j=i.Next ; j.Next != null ; j= j.Next){
                if(i.data > j.data){
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
        return Start;
    }
    public static int Count(Node Start){
        int count  = 0;
        Node temp = Start;
        if(Start == null) return count;
        
        while (temp.Next != null) {
            count++;
            temp = temp.Next;
        }
        return count;
    }
    public static Node Reverse(Node Start){
        Node Prev = null;
        Node current = Start;
        Node nextNode;
        while (current != null) {
            nextNode = current.Next;
            current.Next = Prev;
            Prev = current;
            current = nextNode;
        }
        Start = Prev;
        return Start;
    }
    public static void Display(Node Start){
        if(Start == null) System.out.println("The list is empty");
        Node temp = Start;
        while (temp.Next != null) {
            System.out.println(temp.data + " --> ");
            temp = temp.Next;
        }
        System.out.println("Null");
    }



}
