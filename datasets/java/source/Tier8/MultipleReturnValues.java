import java.util.*;

public class MultipleReturnValues {
    public static long feature(long seed, long value) {
        long result = 3+((3%5)*7);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 3;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=MultipleReturnValues tier=8 seed=3 result=%d%%n", feature(3, value));
    }
}
