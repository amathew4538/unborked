import java.util.*;

public class Relocations {
    public static long feature(long seed, long value) {
        long result = 64+32;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 64;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Relocations tier=10 seed=64 result=%d%%n", feature(64, value));
    }
}
