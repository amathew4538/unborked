import java.util.*;

public class SimdIntrinsics {
    public static long feature(long seed, long value) {
        long result = (81*(81+1))/2;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 81;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=SimdIntrinsics tier=14 seed=81 result=%d%%n", feature(81, value));
    }
}
