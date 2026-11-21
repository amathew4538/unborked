package datasets.java.source.Tier1;

public class Multiplication {
    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(multiply(0, 1));
        System.out.println(multiply(7, 13));
        System.out.println(multiply(65536, 1000));
        System.out.println(multiply(64, 8));
        System.out.println(multiply(-42, -1));
    }
}
