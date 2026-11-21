import java.util.*;

public class ParallelLoop {
    public static long feature(long seed, long value) {
        long result = 1+(71%8);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 71;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=ParallelLoop tier=11 seed=71 result=%d%%n", feature(71, value));
    }
}
