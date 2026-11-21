import java.util.*;

public class StrengthReduction {
    public static long feature(long seed, long value) {
        long result = (58*(58+1))/2;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 58;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=StrengthReduction tier=14 seed=58 result=%d%%n", feature(58, value));
    }
}
