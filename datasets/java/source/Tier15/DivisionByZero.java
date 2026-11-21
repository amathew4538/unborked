import java.util.*;

public class DivisionByZero {
    public static long feature(long seed, long value) {
        long result = 100/((92%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 92;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=DivisionByZero tier=15 seed=92 result=%d%%n", feature(92, value));
    }
}
