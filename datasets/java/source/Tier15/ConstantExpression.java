import java.util.*;

public class ConstantExpression {
    public static long feature(long seed, long value) {
        long result = 100/((28%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 28;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=ConstantExpression tier=15 seed=28 result=%d%%n", feature(28, value));
    }
}
