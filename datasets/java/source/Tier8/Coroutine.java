import java.util.*;

public class Coroutine {
    public static long feature(long seed, long value) {
        long result = 30+((30%5)*7);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 30;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Coroutine tier=8 seed=30 result=%d%%n", feature(30, value));
    }
}
