class Run{
    String Name;
    double Distance;
    void setDetail(String Name, double Distance){
        this.Name = Name;
        this.Distance = Distance;
    }
    void dispaly(){
        System.out.println("The Name of the runner : " + Name);
        System.out.println("The Distance coverd is : " + Distance);
    }
}


public class runner {
    public static void main(String[] args) {
        Run r1 = new Run();
        Run r2 = new Run();
        r1.setDetail("Anjani" , 5009.3);
        r2.setDetail("Amit", 833.5);
        r1.dispaly();
        r2.dispaly();
        System.out.println("The Runner with max Distnce ");
        if(r1.Distance > r2.Distance)
            r1.dispaly();
        else
            r2.dispaly();
    }
    
}
