import java.util.*;

public class ConstantPropagation {
    public static long feature(long seed, long value) {
        long result = (75*(75+1))/2;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 75;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=ConstantPropagation tier=14 seed=75 result=%d%%n", feature(75, value));
    }
}
