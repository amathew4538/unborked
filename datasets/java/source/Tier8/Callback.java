import java.util.*;

public class Callback {
    public static long feature(long seed, long value) {
        long result = 49+((49%5)*7);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 49;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Callback tier=8 seed=49 result=%d%%n", feature(49, value));
    }
}
