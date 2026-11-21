import java.util.*;

public class ParallelReduction {
    public static long feature(long seed, long value) {
        long result = 1+(45%8);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 45;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=ParallelReduction tier=11 seed=45 result=%d%%n", feature(45, value));
    }
}
