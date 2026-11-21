import java.util.*;

public class StackFrame {
    public static long feature(long seed, long value) {
        long result = 90+32;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 90;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=StackFrame tier=10 seed=90 result=%d%%n", feature(90, value));
    }
}
