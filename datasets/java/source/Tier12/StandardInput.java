import java.util.*;

public class StandardInput {
    public static long feature(long seed, long value) {
        long result = 24%1024;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 24;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=StandardInput tier=12 seed=24 result=%d%%n", feature(24, value));
    }
}
