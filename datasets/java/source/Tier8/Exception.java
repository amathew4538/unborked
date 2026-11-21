import java.util.*;

public class Exception {
    public static long feature(long seed, long value) {
        long result = 29+((29%5)*7);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 29;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Exception tier=8 seed=29 result=%d%%n", feature(29, value));
    }
}
