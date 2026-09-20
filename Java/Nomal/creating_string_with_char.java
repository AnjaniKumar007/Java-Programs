public class creating_string_with_char{
    public static void main(String[] args) {

        char[] ch = {'c', 'a', 'r', 'b', 'o', 'n'};

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (j == i) continue;

                for (int k = 0; k < 6; k++) {
                    if (k == i || k == j) continue;

                    for (int l = 0; l < 6; l++) {
                        if (l == i || l == j || l == k) continue;

                        for (int m = 0; m < 6; m++) {
                            if (m == i || m == j || m == k || m == l) continue;

                            for (int n = 0; n < 6; n++) {
                                if (n == i || n == j || n == k || n == l || n == m) continue;

                                System.out.println("" +
                                        ch[i] + ch[j] + ch[k] +
                                        ch[l] + ch[m] + ch[n]);
                            }
                        }
                    }
                }
            }
        }
    }
}
