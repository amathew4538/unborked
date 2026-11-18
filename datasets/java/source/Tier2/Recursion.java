package datasets.java.source.Tier1;

public class Recursion {
    static int factorial(int n) {
        return n<=1 ? 1 : n*factorial(n-1);
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
