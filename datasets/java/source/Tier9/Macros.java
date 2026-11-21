import java.util.*;

public class Macros {
    public static long feature(long seed, long value) {
        long result = (38%11)+40;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 38;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Macros tier=9 seed=38 result=%d%%n", feature(38, value));
    }
}
