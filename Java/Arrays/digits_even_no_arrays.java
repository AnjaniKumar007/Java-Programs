public class digits_even_no_arrays {
    public static void main(String[] args) {
        int[] arr = { 21, 45, 22, 46, 746, 3468, 3 };
        System.out.println(Findnumber(arr));
    }

    static int Findnumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (Even(num)) {
                count++;
            }

        }
        return count;

    }

    static boolean Even(int num) {
        int numberOfDigits = Digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int Digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;

    }

}
