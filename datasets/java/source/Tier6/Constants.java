import java.util.*;

public class Constants {
    public static long feature(long seed, long value) {
        long result = 27*17+3;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 27;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Constants tier=6 seed=27 result=%d%%n", feature(27, value));
    }
}
