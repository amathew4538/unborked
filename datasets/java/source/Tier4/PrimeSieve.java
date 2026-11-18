package datasets.java.source.Tier4;

public class PrimeSieve {
    public static void main(String[] args) {
        int limit = 30;
        boolean[] prime = new boolean[limit + 1];
        java.util.Arrays.fill(prime, 2, limit + 1, true);
        for (int i = 2; i * i <= limit; i++) {
            if (prime[i]) {
                for (int multiple = i * i; multiple <= limit; multiple += i) prime[multiple] = false;
            }
        }
        System.out.print("primes:");
        for (int i = 2; i <= limit; i++) if (prime[i]) System.out.print(" " + i);
        System.out.println();
    }
}
