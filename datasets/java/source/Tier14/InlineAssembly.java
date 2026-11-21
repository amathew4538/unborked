import java.util.*;

public class InlineAssembly {
    public static long feature(long seed, long value) {
        long result = (28*(28+1))/2;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 28;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=InlineAssembly tier=14 seed=28 result=%d%%n", feature(28, value));
    }
}
