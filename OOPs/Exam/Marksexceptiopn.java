class Student{
    int Marks;
    String Name;
    int RollNO;
    Student(int Marks, String Name, int RollNO)throws MArksOutOfBoundException{
        if(Marks>100){
            throw new MArksOutOfBoundException("Marks out of bound");
        }
        this.Marks =Marks;
        this.Name = Name;
        this.RollNO = RollNO;
    }
    void displayinfo(){
        System.out.println("The name of the Student : " + Name);
        System.out.println("The marks of the student : " + Marks);
        System.out.println("The roll No of the Student : "+ RollNO);
    }
    
}
class MArksOutOfBoundException extends Exception{
    MArksOutOfBoundException(String msg){
        super(msg);
    }
}





public class Marksexceptiopn {
    public static void main(String[] args) {
        try{
            Student ob = new Student(101, "Anjani", 18);
            ob.displayinfo();
        }
        catch (MArksOutOfBoundException e){
            System.out.println("Exception : "+ e.getMessage() );
        }
    }
}
