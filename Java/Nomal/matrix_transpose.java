
import java.util.Scanner;

public class matrix_transpose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row and col of arr :");
        int row = in.nextInt(), col = in.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the element of arr : ");
        for(int i = 0; i<row;i++){
            for(int j = 0 ; j<col; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int[][] trans = new int[col][row];
        for(int i = 0 ; i < row; i++){
            for(int j = 0 ; j<col ; j++){
                trans[i][j] = arr[j][i];
            }
        }
        System.out.println("Transpose of matrix : ");
        for(int i = 0 ; i<col ; i++){
            for(int j = 0 ; j<row ; j++){
                System.out.println(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
