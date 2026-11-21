import java.util.*;

public class SymbolVisibility {
    public static long feature(long seed, long value) {
        long result = 15+32;
        return result + seed + value;
    }

    public static void main(String[] args) {
        long value = 15;
        if (args.length > 0) {
            try { value = Long.parseLong(args[0]); } catch (NumberFormatException ignored) {}
        }
        System.out.printf("feature=SymbolVisibility tier=10 seed=15 result=%d%%n", feature(15, value));
    }
}
