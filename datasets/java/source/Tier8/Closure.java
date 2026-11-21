import java.util.*;

public class Closure {
    public static long feature(long seed, long value) {
        long result = 45+((45%5)*7);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 45;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Closure tier=8 seed=45 result=%d%%n", feature(45, value));
    }
}
