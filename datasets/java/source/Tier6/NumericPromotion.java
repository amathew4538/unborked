import java.util.*;

public class NumericPromotion {
    public static long feature(long seed, long value) {
        long result = 96*17+3;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 96;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=NumericPromotion tier=6 seed=96 result=%d%%n", feature(96, value));
    }
}
