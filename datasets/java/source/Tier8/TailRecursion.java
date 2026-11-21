import java.util.*;

public class TailRecursion {
    public static long feature(long seed, long value) {
        long result = 63+((63%5)*7);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 63;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=TailRecursion tier=8 seed=63 result=%d%%n", feature(63, value));
    }
}
