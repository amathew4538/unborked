import java.util.*;

public class VectorOperations {
    public static long feature(long seed, long value) {
        long result = (7*(7+1))/2;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 7;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=VectorOperations tier=14 seed=7 result=%d%%n", feature(7, value));
    }
}
