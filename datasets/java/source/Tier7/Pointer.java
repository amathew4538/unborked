import java.util.*;

public class Pointer {
    public static long feature(long seed, long value) {
        long result = (34%16)*4;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 34;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Pointer tier=7 seed=34 result=%d%%n", feature(34, value));
    }
}
