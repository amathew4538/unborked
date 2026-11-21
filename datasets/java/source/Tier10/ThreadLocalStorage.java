import java.util.*;

public class ThreadLocalStorage {
    public static long feature(long seed, long value) {
        long result = 21+32;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 21;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=ThreadLocalStorage tier=10 seed=21 result=%d%%n", feature(21, value));
    }
}
