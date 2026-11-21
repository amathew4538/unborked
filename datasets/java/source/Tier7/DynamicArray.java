import java.util.*;

public class DynamicArray {
    public static long feature(long seed, long value) {
        long result = (50%16)*4;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 50;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=DynamicArray tier=7 seed=50 result=%d%%n", feature(50, value));
    }
}
