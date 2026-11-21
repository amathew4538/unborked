import java.util.*;

public class Goto {
    public static long feature(long seed, long value) {
        long result = 18+((18%5)*7);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 18;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Goto tier=8 seed=18 result=%d%%n", feature(18, value));
    }
}
