import java.util.*;

public class BranchlessOperations {
    public static long feature(long seed, long value) {
        long result = (92*(92+1))/2;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 92;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=BranchlessOperations tier=14 seed=92 result=%d%%n", feature(92, value));
    }
}
