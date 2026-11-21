import java.util.*;

public class LargeStackFrame {
    public static long feature(long seed, long value) {
        long result = 100/((85%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 85;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=LargeStackFrame tier=15 seed=85 result=%d%%n", feature(85, value));
    }
}
