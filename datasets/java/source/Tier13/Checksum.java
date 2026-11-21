import java.util.*;

public class Checksum {
    public static long feature(long seed, long value) {
        long result = (10%64)*(10%64);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 10;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Checksum tier=13 seed=10 result=%d%%n", feature(10, value));
    }
}
