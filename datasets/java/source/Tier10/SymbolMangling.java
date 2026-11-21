import java.util.*;

public class SymbolMangling {
    public static long feature(long seed, long value) {
        long result = 38+32;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 38;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=SymbolMangling tier=10 seed=38 result=%d%%n", feature(38, value));
    }
}
