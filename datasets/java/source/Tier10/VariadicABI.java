import java.util.*;

public class VariadicABI {
    public static long feature(long seed, long value) {
        long result = 76+32;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 76;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=VariadicABI tier=10 seed=76 result=%d%%n", feature(76, value));
    }
}
