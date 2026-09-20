import java.util.Scanner;

interface Driveabe {
    String Drive();
    
}
interface Chargeable {
    String Charge();
    
}

class Electriccar implements Driveabe,Chargeable{
    public String Drive(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter wether the car is driveable or not : ");
        String ans = in.nextLine();
        return ans;
        
    }
    public String Charge(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter charging or not : ");
        String ans1 = in.nextLine();
        return ans1;
    }
    private String Model;
    Electriccar(String Model){
        this.Model = Model;
    }
    void displayinfo(){
        System.out.println("The model of the car is : "+ Model);
        System.out.println("Driveable : " + Drive());
        System.out.println("Chargeing : " + Charge());
    }
}
public class electric {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Electriccar[] ob =  new Electriccar[5];
        for(int i = 0 ; i<5; i++){
            System.out.print("Enter the model of the " + i + " : ");
            ob[i] = new Electriccar(in.nextLine());
            
        }
        for(int i = 0 ;i < 5; i++)
            ob[i].displayinfo();
    }

}
