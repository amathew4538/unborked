import java.util.*;

public class Regex {
    public static long feature(long seed, long value) {
        long result = (45%64)*(45%64);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 45;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Regex tier=13 seed=45 result=%d%%n", feature(45, value));
    }
}
