import java.util.*;

public class ExplicitConversion {
    public static long feature(long seed, long value) {
        long result = 46*17+3;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 46;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=ExplicitConversion tier=6 seed=46 result=%d%%n", feature(46, value));
    }
}
