public class deposite {
    public static void main(String[] args) {
        Deposit obj1 = new Deposit();
        obj1.Principal = 1000;
        obj1.Time = 1;
        obj1.Rate = 4.5;
        obj1.display();
        obj1.clac_amt();
    }
}

class Deposit{
    long Principal;
    int Time;
    double Rate;
    double Total_amt;

    Deposit(){

    }

    Deposit(long principal , int time , double rate){
        this.Principal = principal;
        this.Time = time;
        this.Rate = rate;
    }
    Deposit(long principal , int time){
        this.Principal = principal;
        this.Time = time;
    }
    Deposit(long principal , double rate){
        this.Principal = principal;
        this.Rate = rate;
    }
    void display(){
        System.out.println("The Princple Amount : " + Principal);
        System.out.println("The Time Period : " + Time);
        System.out.println("The Rate of intrest : " + Rate);
    }
    void clac_amt(){
        Total_amt = Principal + (Principal*Rate*Time)/100;
        System.out.println("The Total Amount is  : " + Total_amt); 
    }
}
