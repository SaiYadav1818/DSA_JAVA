import java.util.Scanner;

public class xorpro {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long product = 1;

            // Loop over all 32 bits (for 32-bit integers)
            for (int i = 0; i < 32; i++) {
                long countOnes = 0;
                long countZeros = 0;

                for (int num : arr) {
                    if ((num & (1 << i)) != 0) {
                        countOnes++;
                    } else {
                        countZeros++;
                    }
                }

                long pairs = (countOnes * countZeros) % MOD;
                long contribution = (pairs * (1L << i)) % MOD;

                if (contribution > 0) {
                    product = (product * contribution) % MOD;
                }
            }

            System.out.println(product);
        }

        sc.close();
    }
}
