package datasets.java.source.Tier1;

public class Division {
    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println(divide(0, 1));
        System.out.println(divide(7, 13));
        System.out.println(divide(65536, 1000));
        System.out.println(divide(64, 8));
        System.out.println(divide(-42, -1));
    }
}
