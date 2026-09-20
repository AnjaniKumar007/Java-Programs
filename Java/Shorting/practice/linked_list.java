import java.util.*;
class Node{
    int data;
    Node Next;
    Node(int data){
        this.data = data;
        this.Next = null;
    }
}

class linked_list{
    static Scanner in = new Scanner(System.in);
    public static Node Create(Node Start){
        System.out.print("Enter the Value of the data : ");
        int data = in.nextInt();
        Node newnode = new Node(data);
        if(Start == null){
            Start = newnode;
        }
        else{
            Node Temp = Start;
            while (Temp.Next != null) {
                Temp = Temp.Next;
                
            }
            Temp.Next = newnode;
        }
        return Start;
    }
    public static Node inBeg(Node Start){
        System.out.print("Enter the Value of the data : ");
        int data = in.nextInt();
        Node newNode = new Node(data);
        if(Start == null){
            Start = newNode;
        }
        else{
            newNode.Next = Start;
            Start = newNode;
            
        }
        return Start;
    }
    public static Node inEnd(Node Start){
        System.out.print("Enter the Value of the data : ");
        int data = in.nextInt();
        Node newNode = new Node(data);
        if(Start == null){
            return inBeg(Start);
        }
        else {
            Node temp = Start;
            while (temp.Next != null) {
                temp = temp.Next;
            }
            temp.Next = newNode;
        }
        return Start;
    }
    public static Node inAny(Node Start){
        System.out.println("Enter the postion of the Node : ");
        int pos = in.nextInt();
        if(pos == 1){
            return inBeg(Start);
        }
        System.out.println("Enter the Data : ");
        int data = in.nextInt();
        Node newNode = new Node(data);
        Node temp = Start;
        for(int i = 1 ; i<pos-1 && temp != null ; i++){
            temp = temp.Next;
        }
        if(temp == null){
            System.out.println("Invalid Postion");
        }
        else{
            newNode.Next = temp.Next;
            temp.Next = newNode;
        }
        return Start;
        
    }
    public static Node DelBeg(Node Start){
        if(Start == null){
            System.out.println("List is Empty");
        }
        else{
            Start = Start.Next;
        }
        return Start;
    }
    public static Node DelEnd(Node Start){
        if(Start == null){
            System.out.println("List is Empty");
        }
        else if (Start.Next == null) {
            Start = null;
        }
        else{
            Node temp = Start;
            while (temp.Next.Next != null) {
                temp = temp.Next;
            }
            temp.Next = null;

        }
        return Start;
    }
    public static Node DelAny(Node Start){
        System.out.println("Enter the Postion : ");
        int pos = in.nextInt();

        if(pos == 1){
            return DelBeg(Start);
        }
        Node temp =  Start;
        for(int i = 1 ; i<pos-1 && temp != null ; i++){
            temp = temp.Next;
        }
        if(temp == null || temp.Next == null){
            System.out.println("Invalid Position");
        }
        else{
            temp.Next = temp.Next.Next;
        }
        return Start;
    }
    public static void Search(Node Start){
        System.out.println("Enter the value You want to Search : ");
        int data = in.nextInt();
        Node temp = Start;
        while (temp != null) {
            if(temp.data == data){
                System.out.println("Data Found");
            }
            temp = temp.Next;
            
        }
        System.out.println("Data not Found");
    }
    public static void Sort(Node Start){
        if(Start == null){
            return;
        }
        Node i,j;
        for(i = Start; i != null ;i = i.Next){
            for(j = i.Next ; j !=null ; j = j.Next){
                if(i.data > j.data){
                    int temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }

    }
    public static int Count(Node Start){
        int count = 0 ;
        Node temp = Start;
        if(Start == null){
            return count;
        }
        while (temp != null) {
            count++;
            temp = temp.Next;
        }
        return count;
    }
    public static Node  Reverse(Node Start){
        Node prev = null;
        Node current  = Start;
        Node nextNode;
        while(current != null){
            nextNode = current.Next;
            current.Next = prev;
            prev = current;
            current = nextNode;
        }
        Start = prev;
        return Start;

    }
    public static void Display(Node Start){
        if(Start == null){
            System.out.println("The list is empty");
        }
        Node temp = Start;
        while (temp != null) {
            System.out.print(temp.data + " --> " );
            temp = temp.Next;
        }
        System.out.println("End");
    }

    // Main Method
    public static void main(String[] args) {

        Node start = null;
        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Create List");
            System.out.println("2. Insert at Beginning");
            System.out.println("3. Insert at End");
            System.out.println("4. Insert at Any Position");
            System.out.println("5. Delete from Beginning");
            System.out.println("6. Delete from End");
            System.out.println("7. Delete from Any Position");
            System.out.println("8. Delete by Registration No");
            System.out.println("9. Search and Update");
            System.out.println("10. Sort List");
            System.out.println("11. Count Nodes");
            System.out.println("12. Reverse List");
            System.out.println("13. Display List");
            System.out.println("14. Exit");

            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch (choice) {

                case 1:
                    start = Create(start);
                    break;

                case 2:
                    start = inBeg(start);
                    break;

                case 3:
                    start = inEnd(start);
                    break;

                case 4:
                    start = inAny(start);
                    break;

                case 5:
                    start = DelBeg(start);
                    break;

                case 6:
                    start = DelEnd(start);
                    break;

                case 7:
                    start = DelAny(start);
                    break;

                case 8:
                    break;

                case 9:
                    Search(start);
                    break;

                case 10:
                    Sort(start);
                    break;

                case 11:
                    System.out.println("Total Nodes = " + Count(start));
                    break;

                case 12:
                    start = Reverse(start);
                    System.out.println("List Reversed");
                    break;

                case 13:
                    Display(start);
                    break;

                case 14:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 14);
    }

    
    
}