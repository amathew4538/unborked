package datasets.java.source.Tier3;

public class StringProcessing {
    public static void main(String[] args) {
        String input = "Hello World!";
        System.out.println("upper: " + input.toUpperCase());
        System.out.println("reverse: " + new StringBuilder(input).reverse());
        System.out.println("words: " + input.trim().split("\\s+").length);
    }
}
