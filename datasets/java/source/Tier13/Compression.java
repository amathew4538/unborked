import java.util.*;

public class Compression {
    public static long feature(long seed, long value) {
        long result = (52%64)*(52%64);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 52;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Compression tier=13 seed=52 result=%d%%n", feature(52, value));
    }
}
