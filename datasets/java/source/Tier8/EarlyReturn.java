import java.util.*;

public class EarlyReturn {
    public static long feature(long seed, long value) {
        long result = 91+((91%5)*7);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 91;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=EarlyReturn tier=8 seed=91 result=%d%%n", feature(91, value));
    }
}
