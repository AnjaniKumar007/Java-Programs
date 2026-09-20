
import java.util.Scanner;

public class sum_of_coloum_matirx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row and col of arr :");
        int row = in.nextInt(), col = in.nextInt();
        double[][] arr = new double[row][col];
        System.out.println("Enter the element of arr : ");
        for(int i = 0; i<row;i++){
            for(int j = 0 ; j<col; j++){
                arr[i][j] = in.nextDouble();
            }
        }
        System.out.println("Enter the coloum you want sum : ");
        int colsum = in.nextInt();
        System.out.println("The sum of all coloum Element is : " + sumofColoum(arr, colsum));
        
    }
    public static double sumofColoum(double[][] arr , int col){
        double sum = 0;
        for(int i = 0 ; i<3 ; i++){
            sum += arr[i][col];
        }
        return sum;
        
    }
}
