import java.util.*;

public class Assertion {
    public static long feature(long seed, long value) {
        long result = 73+((73%5)*7);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 73;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Assertion tier=8 seed=73 result=%d%%n", feature(73, value));
    }
}
