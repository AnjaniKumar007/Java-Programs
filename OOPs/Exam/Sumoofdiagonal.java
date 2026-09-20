public class Sumoofdiagonal{
    public static double SumofDiagonal(double[][] arr,int rows, int cols){
       double sum = 0;
       for(int i = 0; i<rows;i++){
            for(int j = 0 ; j<cols; j++){
                if(i==j){
                    sum += arr[i][j];
                }
            }
       } 
       return sum;
    }
}