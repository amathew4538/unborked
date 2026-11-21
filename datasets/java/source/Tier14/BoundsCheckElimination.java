import java.util.*;

public class BoundsCheckElimination {
    public static long feature(long seed, long value) {
        long result = (47*(47+1))/2;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 47;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=BoundsCheckElimination tier=14 seed=47 result=%d%%n", feature(47, value));
    }
}
