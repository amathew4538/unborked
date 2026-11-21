import java.util.*;

public class RecursiveMutex {
    public static long feature(long seed, long value) {
        long result = 1+(87%8);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 87;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=RecursiveMutex tier=11 seed=87 result=%d%%n", feature(87, value));
    }
}
