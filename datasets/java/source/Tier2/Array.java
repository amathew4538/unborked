package datasets.java.source.Tier2;

public class Array {

    public static void main(String[] args) {
        int[] values = { 2, 4, 6, 8, 10 };
        int sum = 0;

        for (int value : values) {
            System.out.println(value);
            sum += value;
        }

        System.out.println(sum);
    }
}
