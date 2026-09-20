public class LL{
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }

    public void InsertFirst(int val){
        Node node = new Node(val);
        node.Next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
        
    }
    public void InsertLast(int val){
        if(tail == null){
             InsertFirst(val);
             return;
        }
        Node node =  new Node(val);
            tail.Next = node;
            tail = node;
            size++;
        
    }
    public void Insert(int value ,  int index){
        if(index == 0){
            InsertFirst(value);
            return;
        }
        if(index == size){
            InsertLast(value);
            return;
        }
        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.Next;
        }
        Node node = new Node(value,temp.Next);
        temp.Next = node;
        size++;
    }
    public int DeleteFirst(){
        int val = head.value;
        head = head.Next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public int DeleteLast(){
        if(tail == null){
            return DeleteFirst();
        }
        Node SecondLast = get(size-2);
        int val = tail.value;
        tail = SecondLast;
        tail.Next = null;
        return val;
    }
    public int Delete(int index){
        if(index == 0){
            return DeleteFirst();
        }
        if(index == size-1){
            return DeleteLast();
        }
        Node prev = get(index-1);
        int val = prev.Next.value;
        prev.Next = prev.Next.Next;
        return val;
    }
    public int ValueOf(int index){
        Node val = get(index);
        int value = val.value;

        return value;

    }
    public Node Find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.Next;
        }
        return null;
    }
    public Node get(int index){
        Node temp = head;
        for(int i = 0 ; i<index; i++){
            temp = temp.Next;
        }
        return temp;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " --> ");
            temp = temp.Next;
        }
        System.out.println("End");
    }



    private class Node{
        private int value;
        private Node Next;

        public Node (int value){
            this.value = value;
        }
        public Node(int value,  Node Next){
            this.value = value;
            this.Next = Next;
        }
    }
}