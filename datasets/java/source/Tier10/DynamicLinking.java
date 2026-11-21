import java.util.*;

public class DynamicLinking {
    public static long feature(long seed, long value) {
        long result = 91+32;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 91;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=DynamicLinking tier=10 seed=91 result=%d%%n", feature(91, value));
    }
}
