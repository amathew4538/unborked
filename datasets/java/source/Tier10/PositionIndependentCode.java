import java.util.*;

public class PositionIndependentCode {
    public static long feature(long seed, long value) {
        long result = 88+32;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 88;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=PositionIndependentCode tier=10 seed=88 result=%d%%n", feature(88, value));
    }
}
