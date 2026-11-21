import java.util.*;

public class TailCallOptimization {
    public static long feature(long seed, long value) {
        long result = (59*(59+1))/2;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 59;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=TailCallOptimization tier=14 seed=59 result=%d%%n", feature(59, value));
    }
}
