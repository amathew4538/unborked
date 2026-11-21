import java.util.*;

public class Queue {
    public static long feature(long seed, long value) {
        long result = (39%64)*(39%64);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 39;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Queue tier=13 seed=39 result=%d%%n", feature(39, value));
    }
}
