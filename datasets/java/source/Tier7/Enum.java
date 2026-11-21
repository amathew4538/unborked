import java.util.*;

public class Enum {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException ignored) {
            }
        }
        System.out.printf("feature=Enum args=%d sum=%d%%n", args.length, sum);
    }
}
