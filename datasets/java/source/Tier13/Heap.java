import java.util.*;

public class Heap {
    public static long feature(long seed, long value) {
        long result = (43%64)*(43%64);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 43;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Heap tier=13 seed=43 result=%d%%n", feature(43, value));
    }
}
