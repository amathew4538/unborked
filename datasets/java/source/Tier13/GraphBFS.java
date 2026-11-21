import java.util.*;

public class GraphBFS {
    public static long feature(long seed, long value) {
        long result = (4%64)*(4%64);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 4;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=GraphBFS tier=13 seed=4 result=%d%%n", feature(4, value));
    }
}
