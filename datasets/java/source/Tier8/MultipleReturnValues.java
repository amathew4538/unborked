import java.util.*;

public class MultipleReturnValues {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException ignored) {
            }
        }
        System.out.printf("feature=MultipleReturnValues args=%d sum=%d%%n", args.length, sum);
    }
}
