import java.util.*;

public class FunctionInlining {
    public static long feature(long seed, long value) {
        long result = (41*(41+1))/2;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 41;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=FunctionInlining tier=14 seed=41 result=%d%%n", feature(41, value));
    }
}
