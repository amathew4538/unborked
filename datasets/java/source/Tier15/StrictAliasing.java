import java.util.*;

public class StrictAliasing {
    public static long feature(long seed, long value) {
        long result = 100/((35%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 35;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=StrictAliasing tier=15 seed=35 result=%d%%n", feature(35, value));
    }
}
