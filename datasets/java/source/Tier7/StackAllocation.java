import java.util.*;

public class StackAllocation {
    public static long feature(long seed, long value) {
        long result = (51%16)*4;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 51;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=StackAllocation tier=7 seed=51 result=%d%%n", feature(51, value));
    }
}
