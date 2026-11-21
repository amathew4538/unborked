import java.util.*;

public class EmptyFunction {
    public static long feature(long seed, long value) {
        long result = 100/((79%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 79;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=EmptyFunction tier=15 seed=79 result=%d%%n", feature(79, value));
    }
}
