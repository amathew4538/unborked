import java.util.*;

public class Reflection {
    public static long feature(long seed, long value) {
        long result = (52%11)+40;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 52;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Reflection tier=9 seed=52 result=%d%%n", feature(52, value));
    }
}
