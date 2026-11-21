import java.util.*;

public class UnspecifiedBehavior {
    public static long feature(long seed, long value) {
        long result = 100/((62%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 62;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=UnspecifiedBehavior tier=15 seed=62 result=%d%%n", feature(62, value));
    }
}
