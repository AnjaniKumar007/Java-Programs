import java.util.Arrays;
import java.util.Random;

public class no {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        Random rand = new Random();

        // Fill array with random numbers between 1 and 1000
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000) + 1;
        }

        // Print array
        System.out.println(Arrays.toString(arr));
    }
}
