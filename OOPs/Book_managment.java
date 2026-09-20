import java.util.Scanner;

class Book{
    int Bookid ;
    double Price;
    int Quantity;

    static double totalAmount = 0;

    Book(int id , double price , int quantity){
        this.Bookid = id;
        this.Price = price;
        this.Quantity = quantity;
        totalAmount += totalCost();
    }
    double totalCost(){
        return ( Price * Quantity);
    }

    void displaydetail(){
        System.out.println("The Book Id : " + Bookid);
        System.out.println("The Price of the Book : " + Price);
        System.out.println("The Quantity of the Book is : "+  Quantity);
    }
    
    

}
public class Book_managment{
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter the no of the book you want to purchase : ");
        int n = in.nextInt();
        for(int i= 1 ; i<=n ; i++){
            System.out.print("Enter the Detail of Book " + i +" : ");
            Book obj = new Book(in.nextInt() , in.nextDouble(), in.nextInt());
            obj.totalCost();
            obj.displaydetail(); 
            
        }
        System.out.println("The Total amount of the " + n + " Books " + Book.totalAmount); 
    }

}