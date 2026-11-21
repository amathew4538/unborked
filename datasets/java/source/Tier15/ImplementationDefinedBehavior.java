import java.util.*;

public class ImplementationDefinedBehavior {
    public static long feature(long seed, long value) {
        long result = 100/((7%9)+1);
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 7;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=ImplementationDefinedBehavior tier=15 seed=7 result=%d%%n", feature(7, value));
    }
}
