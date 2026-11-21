import java.util.*;

public class SwitchCase {
    public static long feature(long seed, long value) {
        long result = 77*17+3;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 77;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=SwitchCase tier=6 seed=77 result=%d%%n", feature(77, value));
    }
}
