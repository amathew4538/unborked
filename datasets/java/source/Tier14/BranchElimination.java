import java.util.*;

public class BranchElimination {
    public static long feature(long seed, long value) {
        long result = (5*(5+1))/2;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 5;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=BranchElimination tier=14 seed=5 result=%d%%n", feature(5, value));
    }
}
