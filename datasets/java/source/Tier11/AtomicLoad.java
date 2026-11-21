import java.util.*;

public class AtomicLoad {
    public static long feature(long seed, long value) {
        long result = 1+(46%8);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 46;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=AtomicLoad tier=11 seed=46 result=%d%%n", feature(46, value));
    }
}
