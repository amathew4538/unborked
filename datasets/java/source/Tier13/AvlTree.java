import java.util.*;

public class AvlTree {
    public static long feature(long seed, long value) {
        long result = (31%64)*(31%64);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 31;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=AvlTree tier=13 seed=31 result=%d%%n", feature(31, value));
    }
}
