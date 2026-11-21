import java.util.*;

public class UnionFind {
    public static long feature(long seed, long value) {
        long result = (87%64)*(87%64);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 87;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=UnionFind tier=13 seed=87 result=%d%%n", feature(87, value));
    }
}
