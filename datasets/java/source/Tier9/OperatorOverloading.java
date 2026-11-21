import java.util.*;

public class OperatorOverloading {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException ignored) {
            }
        }
        System.out.printf("feature=OperatorOverloading args=%d sum=%d%%n", args.length, sum);
    }
}
