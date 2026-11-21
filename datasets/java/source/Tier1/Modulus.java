package datasets.java.source.Tier1;

public class Modulus {
    static int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        System.out.println(modulo(0, 1));
        System.out.println(modulo(7, 13));
        System.out.println(modulo(65536, 1000));
        System.out.println(modulo(64, 8));
        System.out.println(modulo(-42, -1));
    }
}
