public class main{
    public static void main(String[] args) {
        LL list = new LL();
        list.InsertFirst(13);
        list.InsertFirst(9);
        list.InsertFirst(3);
        list.InsertFirst(6);
        list.InsertFirst(0);
        list.InsertLast(43);
        list.Insert(4,2);
        list.display();
        System.out.println(list.DeleteFirst());
        list.display();
        System.out.println(list.DeleteLast());
        list.display();
        System.out.println(list.Delete(2));
        list.display();
        System.out.println(list.ValueOf(3));
        

    }
}
