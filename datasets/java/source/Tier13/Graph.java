import java.util.*;

public class Graph {
    public static long feature(long seed, long value) {
        long result = (6%64)*(6%64);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 6;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Graph tier=13 seed=6 result=%d%%n", feature(6, value));
    }
}
