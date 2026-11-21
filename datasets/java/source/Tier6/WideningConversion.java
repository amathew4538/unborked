import java.util.*;

public class WideningConversion {
    public static long feature(long seed, long value) {
        long result = 59*17+3;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 59;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=WideningConversion tier=6 seed=59 result=%d%%n", feature(59, value));
    }
}
