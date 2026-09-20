class SAlesMan {
    int empid;
    String Name;
    double sales;
    SAlesMan(int empid , String Name, double sales){
        this.empid = empid;
        this.Name = Name;
        this.sales = sales;
    }
    double getCommision(){
        double commission = 0;
        if(sales<500){
            commission = 0.02 * sales;
        }
        else if(sales<5000){
            commission = 0.05 * sales;
        }
        else{
            commission = 0.08 * sales;
        }
        return commission;
    }
    void display(){
        System.out.println("EmpId :" + empid);
        System.out.println("Name : " + Name);
        System.out.println("Sales : " + sales);
        System.out.println("Commission : " + getCommision());
    }
    
}


public class commission {
    public static void main(String[] args) {
        SAlesMan[] ob = new SAlesMan[5];
        ob[1] = new SAlesMan(324, "Amit", 550);
        ob[1].display();
    }
    
}
