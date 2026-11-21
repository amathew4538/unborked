package datasets.java.source.Tier2;

public class Conditional {
    static String classify(int n) {
        if (n < 0)
            return "negative";
        if (n > 0)
            return "positive";
        return "zero";
    }

    public static void main(String[] args) {
        System.out.println(classify(-1));
        System.out.println(classify(0));
        System.out.println(classify(1));
    }
}
