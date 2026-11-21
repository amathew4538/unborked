import java.util.*;

public class AtomicCompareExchange {
    public static long feature(long seed, long value) {
        long result = 1+(52%8);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 52;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=AtomicCompareExchange tier=11 seed=52 result=%d%%n", feature(52, value));
    }
}
