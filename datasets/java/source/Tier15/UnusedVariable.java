import java.util.*;

public class UnusedVariable {
    public static long feature(long seed, long value) {
        long result = 100/((66%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 66;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=UnusedVariable tier=15 seed=66 result=%d%%n", feature(66, value));
    }
}
