import java.util.*;

public class HashTable {
    public static long feature(long seed, long value) {
        long result = (26%64)*(26%64);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 26;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=HashTable tier=13 seed=26 result=%d%%n", feature(26, value));
    }
}
