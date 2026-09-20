public class Sumoftwomatroix {
    public static void main(String[] args) {
        
    }
    static double[][] Sum_of_Matixs(double[][] a, double[][] b){
        int m = a.length;
        int n = b[0].length;
        double[][] result = new double[m][n];
        for(int i  = 0 ; i<m; i++){
            for(int j= 0; j<n; j++){
                result[i][j] = a[i][j] + a[i][j];
            }

        }
        return result;
    }
}
