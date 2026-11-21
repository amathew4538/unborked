import java.util.*;

public class FloatingPointBoundaryValues {
    public static long feature(long seed, long value) {
        long result = 100/((20%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 20;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=FloatingPointBoundaryValues tier=15 seed=20 result=%d%%n", feature(20, value));
    }
}
