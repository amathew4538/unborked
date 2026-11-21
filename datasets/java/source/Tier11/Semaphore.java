import java.util.*;

public class Semaphore {
    public static long feature(long seed, long value) {
        long result = 1+(29%8);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 29;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Semaphore tier=11 seed=29 result=%d%%n", feature(29, value));
    }
}
