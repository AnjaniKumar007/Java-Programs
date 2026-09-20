
import java.util.Scanner;

public class matrix_digonal_sum {
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
        System.out.println("The sum of all diaonal Element is : " + sumMajorDiagonal(arr, row, col));
        
    }
    public static double sumMajorDiagonal(double[][] arr , int row, int col){
        double sum = 0;
        for(int i = 0 ; i<row ; i++){
            for(int j = 0 ; j<col ; j++){
                if(i==j){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
        
    }
}
