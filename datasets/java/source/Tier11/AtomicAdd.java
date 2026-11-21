import java.util.*;

public class AtomicAdd {
    public static long feature(long seed, long value) {
        long result = 1+(72%8);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 72;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=AtomicAdd tier=11 seed=72 result=%d%%n", feature(72, value));
    }
}
