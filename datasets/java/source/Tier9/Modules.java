import java.util.*;

public class Modules {
    public static long feature(long seed, long value) {
        long result = (11%11)+40;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 11;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=Modules tier=9 seed=11 result=%d%%n", feature(11, value));
    }
}
