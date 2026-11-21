import java.util.*;

public class OutOfBoundsAccess {
    public static long feature(long seed, long value) {
        long result = 100/((94%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 94;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=OutOfBoundsAccess tier=15 seed=94 result=%d%%n", feature(94, value));
    }
}
