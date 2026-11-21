import java.util.*;

public class Coroutine {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException ignored) {
            }
        }
        System.out.printf("feature=Coroutine args=%d sum=%d%%n", args.length, sum);
    }
}
