import java.util.*;

public class BreakContinue {
    public static long feature(long seed, long value) {
        long result = 94+((94%5)*7);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 94;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=BreakContinue tier=8 seed=94 result=%d%%n", feature(94, value));
    }
}
